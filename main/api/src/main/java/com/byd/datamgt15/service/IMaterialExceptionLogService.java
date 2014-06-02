/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.service;

import com.byd.datamgt15.domain.MaterialExceptionLog;
import com.byd.datamgt15.pojo.MaterialExceptionLogView;
import java.util.List;

/**
 * 物料异常信息服务类
 * 
 * @author ty
 */
public interface IMaterialExceptionLogService {

//    public List<MaterialExceptionLog> getList(String materialCode);
    
    public void add(MaterialExceptionLog materialExceptionLog);
    
    public void update(MaterialExceptionLog materialExceptionLog);
    
    public List <MaterialExceptionLogView> getList(String materialCode,Integer startNum, Integer endNum);
    
}
