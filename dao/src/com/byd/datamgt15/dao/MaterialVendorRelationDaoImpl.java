/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.MaterialVendorRelation;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ty
 */
@Repository
public class MaterialVendorRelationDaoImpl extends BaseDaoHibernateImpl<MaterialVendorRelation> implements IMaterialVendorRelationDao {

    @Override
    public void merge(MaterialVendorRelation bean) {
        if (bean.getMaterialCode() == null || bean.getVendorCode() == null) {
            throw new RuntimeException("参数不正确");
        } else {
            MaterialVendorRelation existVendor = this.select(bean);
            if (existVendor == null) {
                this.insert(bean);
            } else {
                dao.update(existVendor);
            }
        }
    }

    @Override
    public void delete(Integer id) {
        MaterialVendorRelation vendor = dao.get(MaterialVendorRelation.class, id);
        if (vendor != null) {
            dao.delete(vendor);
        }
    }

    @Override
    public MaterialVendorRelation select(MaterialVendorRelation bean) {
        if (bean.getId() != null) {
            return dao.get(MaterialVendorRelation.class, bean.getId());
        } else if (bean.getMaterialCode() != null) {
            DetachedCriteria detachedCriteria = DetachedCriteria.forClass(MaterialVendorRelation.class);
            detachedCriteria.add(Restrictions.eq("materialCode", bean.getMaterialCode()));
              detachedCriteria.add(Restrictions.eq("vendorCode", bean.getVendorCode()));
            List findByCriteria = dao.findByCriteria(detachedCriteria);
            if (findByCriteria != null && !findByCriteria.isEmpty()) {
                return (MaterialVendorRelation) findByCriteria.get(0);
            } else {
                return null;
            }
        } else {
            throw new RuntimeException("参数不正确");
        }
    }

}
