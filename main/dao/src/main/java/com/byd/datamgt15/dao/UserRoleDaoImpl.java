/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.UserRole;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ty
 */
@Repository
public class UserRoleDaoImpl extends BaseDaoHibernateImpl<UserRole> implements IUserRoleDao {

    @Override
    public void merge(UserRole bean) {
          if (bean.getUserId() == null || bean.getRoleId() == null) {
            throw new RuntimeException("参数不正确");
        } else {
            UserRole existVendor = this.select(bean);
            if (existVendor == null) {
                this.insert(bean);
            } else {
                dao.update(existVendor);
            }
        }
    }


    @Override
    public UserRole select(UserRole bean) {
        if (bean.getId() != null) {
            return dao.get(UserRole.class, bean.getId());
        } else if (bean.getUserId() != null && bean.getRoleId() != null) {
            DetachedCriteria detachedCriteria = DetachedCriteria.forClass(UserRole.class);
            detachedCriteria.add(Restrictions.eq("userId", bean.getUserId()));
            detachedCriteria.add(Restrictions.eq("roleId", bean.getRoleId()));
            List findByCriteria = dao.findByCriteria(detachedCriteria);
            if (findByCriteria != null && !findByCriteria.isEmpty()) {
                return (UserRole) findByCriteria.get(0);
            } else {
                return null;
            }
        } else {
            throw new RuntimeException("参数不正确");
        }
    }

}
