/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

package com.byd.datamgt15.dao;

import java.util.Collection;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;

/**
 * TODO Criteria抽取，不依赖Hibernate
 * @author ty
 * @param <T>
 */
public interface IBaseDao<T> {
    
    
    public void insert(T bean);
    
    
    /**
     * merge 
     * if id is not null ,then update by id
     * if id is null, then check bean by unique key , if bean exists, then update ,else insert
     * @param bean 
     */
    public void merge(T bean);
    
    public void mergeAll(Collection<T> beans);
    
    public void delete(Integer id);
    
     /**
     * 根据唯一约束删除数据
     *
     * @param bean 在bean中字段作为删除条件
     */
    public void delete(T bean);
    
    public T select(T bean);
    
    
    public List<T> selectList(DetachedCriteria detachedCriteria);
    
    public List<T> selectListByPage(DetachedCriteria detachedCriteria, Integer startNum, Integer endNum);
    
    public Integer count(DetachedCriteria detachedCriteria);
    
    
}
