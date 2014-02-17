/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.Material;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class MaterialDaoImplNGTest {

    IMaterialDao materialDao = null;
    private final Long tag = Calendar.getInstance().getTimeInMillis();

    public MaterialDaoImplNGTest() {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("hibernate_SpringXMLConfig.xml");
            materialDao = applicationContext.getBean(IMaterialDao.class);
        } catch (BeansException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "初始化Spring失败", ex);
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
    public void testMerge() {
        System.out.println("merge");
        Material bean = new Material();
        bean.setMaterialCode(tag.toString());
        bean.setMaterialDesc("物料描述"+tag.toString());
        bean.setQMS("qms"+tag);
        //TODO test lob column
        
        materialDao.merge(bean);
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        materialDao.delete(1);
    }

    @Test
    public void testSelect() {
        System.out.println("select");
            Material params = new Material();
        params.setId(1);
        Material select = materialDao.select(params);
        assertNotNull(select);
        
    }

}
