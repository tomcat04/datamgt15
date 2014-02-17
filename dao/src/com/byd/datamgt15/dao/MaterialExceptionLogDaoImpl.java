/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.MaterialExceptionLog;
import com.byd.datamgt15.exception.AppException;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ty
 */
@Repository
public class MaterialExceptionLogDaoImpl extends BaseDaoHibernateImpl<MaterialExceptionLog> implements IMaterialExceptionLogDao {

    @Override
    public void merge(MaterialExceptionLog bean) {
        dao.merge(bean);
    }


    @Override
    public MaterialExceptionLog select(MaterialExceptionLog bean) {
        if(bean.getId()==null){
            throw new AppException("参数不正确");
        }else{
            return dao.get(MaterialExceptionLog.class, bean.getId());
        }
    }

}
