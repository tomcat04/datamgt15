package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.Vendor;
import java.util.Collection;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ty
 */
@Repository
public class VendorDaoImpl extends BaseDaoHibernateImpl<Vendor> implements IVendorDao {

    @Override
    public void merge(Vendor bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mergeAll(Collection<Vendor> beans) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vendor select(Vendor bean) {
        if(bean.getId()!=null){
            return dao.get(Vendor.class, bean.getId());
        }else if(bean.getVendorCode()!=null){
            DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Vendor.class);
            detachedCriteria.add(Restrictions.eq("vendorCode", bean.getVendorCode()));
            List findByCriteria = dao.findByCriteria(detachedCriteria);
            if(findByCriteria!=null &&!findByCriteria.isEmpty()){
                return (Vendor) findByCriteria.get(0);
            }else{
                return null;
            }
        }else{
            throw new RuntimeException("参数不正确");
        }
    }

    @Override
    public void delete(Integer id) {
        Vendor vendor = dao.get(Vendor.class, id);
        if (vendor != null) {
            dao.delete(vendor);
        }
    }
}
