
package com.byd.datamgt15.service;

import java.io.File;
import java.io.InputStream;
import java.util.List;

/**
 * 文档服务类
 * @author ty
 */
public interface IDocumentService {
    
    /**
     * 根据文件名及物料号，获得文档
     * @param fileName
     * @param materialCode 
     * @return  
     */
    public File getDocument(String fileName,String materialCode);
    
    /**
     * 获得物料对应文档名列表
     * @param materialCode
     * @return 
     */
    public List<String> getDocumentList(String materialCode);
    
    /**
     * 将文件存储到服务器中
     * @param fileName
     * @param materialCode 
     * @param fileInputStream 
     */
    public void saveFile(String fileName,String materialCode,InputStream fileInputStream);
    
    
}
