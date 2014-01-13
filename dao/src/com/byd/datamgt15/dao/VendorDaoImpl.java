
package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.Vendor;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ty
 */
@Repository
public class VendorDaoImpl extends BaseDaoHibernateImpl implements IVendorDao{
    
    public void add(Vendor vendor){
        dao.save(vendor);
    }
}
