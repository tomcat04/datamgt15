/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.MaterialExceptionLog;
import com.byd.datamgt15.pojo.MaterialExceptionLogView;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;

/**
 *
 * @author ty
 */
public interface IMaterialExceptionLogDao extends IBaseDao<MaterialExceptionLog> {

    /**
     * 使用Id进行Merge
     *
     * @param bean
     */
    @Override
    public void merge(MaterialExceptionLog bean);

    /**
     * 使用ID进行查询
     *
     * @param bean
     * @return
     */
    @Override
    public MaterialExceptionLog select(MaterialExceptionLog bean);

    public List<MaterialExceptionLogView> selectViewListByPage(DetachedCriteria detachedCriteria, Integer startNum, Integer endNum);

}
