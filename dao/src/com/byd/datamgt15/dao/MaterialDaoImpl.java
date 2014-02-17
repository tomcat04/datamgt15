/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.Material;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ty
 */
@Repository
public class MaterialDaoImpl extends BaseDaoHibernateImpl<Material> implements IMaterialDao {

    @Override
    public void merge(Material bean) {
        if (bean.getMaterialCode() == null) {
            throw new RuntimeException("参数不正确");
        } else {
            Material existVendor = this.select(bean);
            if (existVendor == null) {
                this.insert(bean);
            } else {
                dao.update(existVendor);
            }
        }
    }

    @Override
    public void delete(Integer id) {
        Material vendor = dao.get(Material.class, id);
        if (vendor != null) {
            dao.delete(vendor);
        }
    }

    @Override
    public Material select(Material bean) {
     if (bean.getId() != null) {
            return dao.get(Material.class, bean.getId());
        } else if (bean.getMaterialCode()!= null) {
            DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Material.class);
            detachedCriteria.add(Restrictions.eq("materialCode", bean.getMaterialCode()));
            List findByCriteria = dao.findByCriteria(detachedCriteria);
            if (findByCriteria != null && !findByCriteria.isEmpty()) {
                return (Material) findByCriteria.get(0);
            } else {
                return null;
            }
        } else {
            throw new RuntimeException("参数不正确");
        }   
    }

}
