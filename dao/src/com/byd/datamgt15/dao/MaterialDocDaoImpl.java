/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.MaterialDoc;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ty
 */
public class MaterialDocDaoImpl extends BaseDaoHibernateImpl<MaterialDoc> implements IMaterialDocDao{

    @Override
    public void merge(MaterialDoc bean) {
  if (bean.getMaterialCode() == null) {
            throw new RuntimeException("参数不正确");
        } else {
            MaterialDoc existVendor = this.select(bean);
            if (existVendor == null) {
                this.insert(bean);
            } else {
                dao.update(existVendor);
            }
        }    }

    @Override
    public void delete(Integer id) {
    MaterialDoc vendor = dao.get(MaterialDoc.class, id);
        if (vendor != null) {
            dao.delete(vendor);
        }    }

    @Override
    public MaterialDoc select(MaterialDoc bean) {
        if (bean.getId() != null) {
            return dao.get(MaterialDoc.class, bean.getId());
        } else if (bean.getMaterialCode() != null) {
            DetachedCriteria detachedCriteria = DetachedCriteria.forClass(MaterialDoc.class);
            detachedCriteria.add(Restrictions.eq("materialCode", bean.getMaterialCode()));
            List findByCriteria = dao.findByCriteria(detachedCriteria);
            if (findByCriteria != null && !findByCriteria.isEmpty()) {
                return (MaterialDoc) findByCriteria.get(0);
            } else {
                return null;
            }
        } else {
            throw new RuntimeException("参数不正确");
        }
    }
    
}
