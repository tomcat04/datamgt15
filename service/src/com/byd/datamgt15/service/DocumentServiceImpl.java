/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.byd.datamgt15.service;

import com.byd.datamgt15.exception.AppException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

/**
 * 文档服务类实现
 *
 * @author ty
 */
@Service
public class DocumentServiceImpl implements IDocumentService {

    /**
     * 文件完全路径 = documentBasePath+materialCode+fileName
     */
    private final String documentBasePath = "/tmp/"; //TODO adapt for windows and linux server
    private String pathSeperator = "/"; //TODO system file seperator

    @Override
    public File getDocument(String fileName, String materialCode) {
        String filePath = documentBasePath + pathSeperator + materialCode + pathSeperator + fileName;
        File document = new File(filePath);
        if (document.exists()) {
            return document;
        } else {
            throw new AppException("物料" + materialCode + "的" + fileName + "不存在");
        }
    }

    /**
     * 获得物料对应文档名列表
     *
     * @param materialCode
     * @return 文档名列表，不含有文档时，返回空列表
     */
    @Override
    public List<String> getDocumentList(String materialCode) {
        List<String> retList = new ArrayList<String>();
        String fileFolderPath = documentBasePath + pathSeperator + materialCode;
        File folder = new File(fileFolderPath);
        if (folder.exists()) {
            File[] listFiles = folder.listFiles();
            for (File file : listFiles) {
                String fileName = file.getName();
                retList.add(fileName);
            }
        }
        return retList;
    }

    //TODO test
    @Override
    public void saveFile(String fileName, String materialCode, InputStream fileInputStream) {
        FileOutputStream writeStream = null;
        String filePath = documentBasePath + pathSeperator + materialCode + pathSeperator + fileName;
        try {
            File file = new File(filePath);
            writeStream = new FileOutputStream(file);
            byte[] bytes = new byte[1024];
            while (fileInputStream.read(bytes) > 0) {
                writeStream.write(bytes);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DocumentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DocumentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (writeStream != null) {
                    writeStream.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(DocumentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
