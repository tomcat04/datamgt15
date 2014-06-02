/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.service;

import com.byd.datamgt15.domain.MaterialDoc;
import com.byd.datamgt15.model.MaterialFullInfo;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;

/**
 *
 * @author ty
 */
public interface IMaterialService {

    /**
     * 查物料整数据
     * 
     * @param detachedCriteria
     * @param startNum
     * @param endNum
     * @return 
     */
    public List<MaterialFullInfo> getMaterialFullInfos(DetachedCriteria detachedCriteria, Integer startNum, Integer endNum);

    /**
     * 查物料整数据(数量)
     * 
     * @param detachedCriteria
     * @return 
     */
    public Integer countMaterialFullInfos(DetachedCriteria detachedCriteria);
    
    /**
     * 添加物料整数据
     * @param materialFullInfo 
     */
    public void addMaterialFullInfo(MaterialFullInfo materialFullInfo);
    
    /**
     * 物料整数据的批量导入
     * @param materialFullInfos 
     */
    public void importMaterialFullInfos(List<MaterialFullInfo> materialFullInfos);
    
    /**
     * 根据物料号获得物料的各文档名称
     * @param materialCode
     * @return 
     */
    public MaterialDoc getMaterialDoc(String materialCode);
    
    
}
