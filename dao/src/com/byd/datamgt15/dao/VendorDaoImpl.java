package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.Vendor;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ty
 */
@Repository
public class VendorDaoImpl extends BaseDaoHibernateImpl implements IVendorDao {

    @Override
    public void insert(Vendor bean) {
        dao.save(bean);
    }

    @Override
    public void insertAll(Collection<Vendor> beans) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void merge(Vendor bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mergeAll(Collection<Vendor> beans) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Vendor bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vendor select(Vendor bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param criteria
     * @return
     */
    @Override
    public List<Vendor> selectList(Criteria criteria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param criteria
     * @param startNum
     * @param endNum
     * @return
     */
    @Override
    public List<Vendor> selectListByPage(Criteria criteria, Integer startNum, Integer endNum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param mycriteria
     * @return
     */
    @Override
    public Integer count(Criteria mycriteria) {

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
