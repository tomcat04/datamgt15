/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

package com.byd.datamgt15.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 *
 * @author ty
 */
public class BaseDaoHibernateImpl{
    @Autowired
    protected HibernateTemplate dao ;
}
