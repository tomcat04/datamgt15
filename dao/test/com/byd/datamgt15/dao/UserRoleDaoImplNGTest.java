/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.UserRole;
import java.util.Calendar;
import java.util.Date;
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
public class UserRoleDaoImplNGTest {

    IUserRoleDao userRoleDao = null;
    private final Long tag = Calendar.getInstance().getTimeInMillis();

    public UserRoleDaoImplNGTest() {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("hibernate_SpringXMLConfig.xml");
            userRoleDao = applicationContext.getBean(IUserRoleDao.class);
        } catch (BeansException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "初始化Spring失败", ex);
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
        UserRole bean = new UserRole();
        bean.setRequestTime(new Date());
        bean.setRoleId(1);
        bean.setStatus("active");
        bean.setUserId(tag.toString());
        userRoleDao.merge(bean);
    }

    @Test
    public void testSelect() {
        System.out.println("select");
        UserRole param = new UserRole();
        param.setUserId(tag.toString());
        param.setRoleId(1);
        UserRole select = userRoleDao.select(param);
        assertNotNull(select);
        assertEquals(select.getUserId() , tag.toString());
    }

}
