/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.MaterialExceptionLog;
import java.util.Calendar;
import java.util.Date;
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
public class MaterialExceptionLogDaoImplNGTest {

    IMaterialExceptionLogDao materialExceptionLogDao = null;
    private final Long tag = Calendar.getInstance().getTimeInMillis();

    public MaterialExceptionLogDaoImplNGTest() {
      try{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("hibernate_SpringXMLConfig.xml");
        materialExceptionLogDao = applicationContext.getBean(IMaterialExceptionLogDao.class);
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
    public void testMerge() {
        //test insert
        System.out.println("merge");
        MaterialExceptionLog bean = new MaterialExceptionLog();
        bean.setBatch("batch"+tag);
        bean.setDealDesc("异常处理描述");
        bean.setExceptionDesc("异常描述");
        bean.setLogTime(new Date());
        bean.setMaterialCode("11111");
        bean.setStatus(1);
       
        materialExceptionLogDao.merge(bean);
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        materialExceptionLogDao.delete(1);
    }

    @Test
    public void testSelect() {
        System.out.println("select");
    
        MaterialExceptionLog params = new MaterialExceptionLog();
        params.setId(1);
        MaterialExceptionLog select = materialExceptionLogDao.select(params);
        assertNotNull(select);
      
    }

}
