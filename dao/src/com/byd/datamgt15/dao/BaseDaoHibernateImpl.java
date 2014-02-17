/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import org.hibernate.Criteria;
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

    /**
     * 子类中T所对应的类型
     */
    private final Class entityClass;

    public BaseDaoHibernateImpl() {
        Type genType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        entityClass = (Class) params[0];
    }

    @Override
    public void insert(T bean) {
        dao.save(bean);
    }

    
    @Override
    public abstract void merge(T bean);

    @Override
    public void mergeAll(Collection<T> beans) {
        for (T bean : beans) {
            this.merge(bean);
        }
    }

    @Override
    public  void delete(Integer id){
        T bean = (T) dao.get(entityClass, id);
        if(bean !=null){
            dao.delete(bean);
        }
    }

    @Override
    public void delete(T bean) {
        dao.delete(bean);
    }

    @Override
    public abstract T select(T bean);

    @Override
    public List<T> selectList(DetachedCriteria criteria) {
        return dao.findByCriteria(criteria);
    }

    @Override
    public List<T> selectListByPage(DetachedCriteria criteria, Integer startNum, Integer endNum) {
        return dao.findByCriteria(criteria, startNum, endNum - startNum + 1);
    }

    @Override
    public Integer count(final DetachedCriteria detachedCriteria) {
        Long count = dao.execute(
                new HibernateCallback<Long>() {
                    @Override
                    public Long doInHibernate(Session session) throws HibernateException, SQLException {
                        Criteria criteria = detachedCriteria.getExecutableCriteria(session);
                        return (Long) criteria.setProjection(Projections.rowCount()).uniqueResult();
                    }
                }
        );
        return count.intValue();
    }
}
