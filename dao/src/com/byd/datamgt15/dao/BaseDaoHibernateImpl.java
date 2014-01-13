/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.dao;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 *
 * @author ty
 * @param <T>
 */
public abstract class BaseDaoHibernateImpl<T> implements IBaseDao<T> {

    @Autowired
    protected HibernateTemplate dao;

    @Override
    public void insert(T bean) {
        dao.save(bean);
    }

    @Override
    public void insertAll(Collection<T> beans) {
        dao.saveOrUpdateAll(beans);
    }

    @Override
    public abstract void merge(T bean);

    @Override
    public abstract void mergeAll(Collection<T> beans);

    @Override
    public abstract void delete(Integer id);

    @Override
    public void delete(T bean) {
        dao.delete(bean);
    }

    @Override
    public abstract T select(T bean);

    @Override
    public List<T> selectList(Criteria criteria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<T> selectListByPage(Criteria criteria, Integer startNum, Integer endNum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer count(Criteria criteria) {
        Long count = dao.execute(
                new HibernateCallback<Long>() {
                    @Override
                    public Long doInHibernate(Session session) throws HibernateException, SQLException {
                        DetachedCriteria detachedCriteria = null;
                        org.hibernate.Criteria criteria = detachedCriteria.getExecutableCriteria(session);
                        return (Long) criteria.setProjection(Projections.rowCount()).uniqueResult();
                    }
                }
        );
        return count.intValue();
    }
}
