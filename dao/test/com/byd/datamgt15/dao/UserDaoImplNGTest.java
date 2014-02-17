/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.User;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ty
 */
public class UserDaoImplNGTest {

    IUserDao userDao = null;
    private final Long tag = Calendar.getInstance().getTimeInMillis();

    public UserDaoImplNGTest() {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("hibernate_SpringXMLConfig.xml");
            userDao = applicationContext.getBean(IUserDao.class);
        } catch (BeansException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "初始化", ex);
        }

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
        User bean = new User();
        bean.setEmail("1234@byd.com");
        bean.setGender("男");
        bean.setJobTitle("测试人员");
        bean.setMobilePhone("186");
        bean.setOrganization("BYD");
        bean.setPassword("t4wfjiogewje3wo");
        bean.setPhone("661237");
        bean.setRegion("深圳");
        bean.setStatus("active");
        bean.setUserId(tag.toString());
        bean.setUserName("用户名字");
        bean.setWorkingLocation("办公地点");
        bean.setWorkingSection("科室");
        bean.setWorkshop("车间");
        userDao.merge(bean);

    }

    @Test
    public void testSelect() {
        System.out.println("select");
        User bean = new User();
        bean.setUserId(tag.toString());
        User select = userDao.select(bean);
        assertNotNull(select);
        assertEquals(select.getUserId(), tag.toString());

    }

}
