/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.Vendor;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ty
 */
public class VendorDaoImplNGTest {

    IVendorDao vendorDao = null;
    private final Long tag = Calendar.getInstance().getTimeInMillis();

    public VendorDaoImplNGTest() {
        try{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("hibernate_SpringXMLConfig.xml");
        vendorDao = applicationContext.getBean(IVendorDao.class);
        }catch(BeansException ex){
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE,"初始化", ex);
        }
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testInsert() {
        System.out.println("add");
        Vendor vendor = new Vendor();
        vendor.setVendorCode("testVendor" + tag);
        vendor.setVendorName("test供应商名称");

        vendorDao.insert(vendor);

    }

    @Test()
    public void testMerge() {
        System.out.println("merge");

        //test update
        Vendor vendor = new Vendor();
        vendor.setVendorCode("testVendor" + tag);
        vendor.setEmail("test@byd.com");
        vendorDao.merge(vendor);

        //test insert 
        Vendor vendor2 = new Vendor();
        vendor2.setVendorCode("testVendor" + (tag-1));
        vendor2.setEmail("test-1@byd.com");
        vendorDao.merge(vendor2);

    }

    @Test()
    public void testSelect() {
        System.out.println("select");
        Vendor param = new Vendor();
        param.setVendorCode("testVendor" + tag);
        Vendor result = vendorDao.select(param);
        assertNotNull(result);
        assertEquals(result.getVendorCode(), "testVendor" + tag);
    }

    @Test
    public void testCount() {
        System.out.println("count vendor");
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Vendor.class);
        detachedCriteria.add(Restrictions.eq("vendorCode", "testVendor"+tag));
        Integer count = vendorDao.count(detachedCriteria);
        assertTrue(count >= 0);

    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        vendorDao.delete(1);
    }

}
