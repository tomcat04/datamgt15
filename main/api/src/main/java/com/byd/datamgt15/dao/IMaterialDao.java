/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.Material;
import com.byd.datamgt15.pojo.MaterialFullInfoView;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;

/**
 *
 * @author ty
 */
public interface IMaterialDao extends IBaseDao<Material> {

    /**
     * 获得物料信息
     *
     * @param detachedCriteria
     * @param startNum
     * @param endNum
     * @return
     */
    public List<MaterialFullInfoView> selectViewListByPage(DetachedCriteria detachedCriteria, Integer startNum, Integer endNum);

}
