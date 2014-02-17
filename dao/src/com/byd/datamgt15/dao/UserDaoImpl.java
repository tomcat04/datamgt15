/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.User;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ty
 */
@Repository
public class UserDaoImpl extends BaseDaoHibernateImpl<User> implements IUserDao {

    @Override
    public void merge(User bean) {
        if (bean.getUserName()== null) {
            throw new RuntimeException("参数不正确");
        } else {
            User existVendor = this.select(bean);
            if (existVendor == null) {
                this.insert(bean);
            } else {
                dao.update(existVendor);
            }
        }
    }

    @Override
    public void delete(Integer id) {
        User vendor = dao.get(User.class, id);
        if (vendor != null) {
            dao.delete(vendor);
        }
    }

    @Override
    public User select(User bean) {
        if (bean.getId() != null) {
            return dao.get(User.class, bean.getId());
        } else if (bean.getUserName() != null) {
            DetachedCriteria detachedCriteria = DetachedCriteria.forClass(User.class);
            detachedCriteria.add(Restrictions.eq("userName", bean.getUserName())); //TODO 用户名还是用户ID
            List findByCriteria = dao.findByCriteria(detachedCriteria);
            if (findByCriteria != null && !findByCriteria.isEmpty()) {
                return (User) findByCriteria.get(0);
            } else {
                return null;
            }
        } else {
            throw new RuntimeException("参数不正确");
        }
    }

}
