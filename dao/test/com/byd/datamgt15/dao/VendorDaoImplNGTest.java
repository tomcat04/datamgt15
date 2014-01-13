/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.Vendor;
import java.util.Collection;
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
        
        vendorDao.insert(vendor);
        
    }

    @Test(enabled = false)
    public void testMerge() {
        System.out.println("merge");
        Vendor bean = null;
       
        vendorDao.merge(bean);
        fail("The test case is a prototype.");
    }

    @Test(enabled = false)
    public void testMergeAll() {
        System.out.println("mergeAll");
        Collection<Vendor> beans = null;
        VendorDaoImpl instance = new VendorDaoImpl();
        instance.mergeAll(beans);
        fail("The test case is a prototype.");
    }

    @Test()
    public void testSelect() {
        System.out.println("select");
        Vendor bean = new Vendor();
        bean.setVendorCode("testVendor");
        Vendor result = vendorDao.select(bean);
        assertNotNull(result);
        assertEquals(result.getVendorCode(), "testVendor");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        vendorDao.delete(1);
    }
    
}
