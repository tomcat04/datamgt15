/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.Vendor;
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
    
    public VendorDaoImplNGTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("hibernate_SpringXMLConfig.xml");
        vendorDao = applicationContext.getBean(IVendorDao.class);
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
    public void testAdd() {
        System.out.println("add");
        Vendor vendor = new Vendor();
        vendor.setVendorCode("testVendor");
        vendor.setVendorName("test供应商名称");
        
        vendorDao.add(vendor);
        
    }
    
}
