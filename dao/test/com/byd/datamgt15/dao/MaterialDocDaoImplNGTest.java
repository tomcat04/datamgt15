/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.dao;

import com.byd.datamgt15.domain.MaterialDoc;
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
public class MaterialDocDaoImplNGTest {

    IMaterialDocDao materialDao = null;
    private final Long tag = Calendar.getInstance().getTimeInMillis();

    public MaterialDocDaoImplNGTest() {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("hibernate_SpringXMLConfig.xml");
            materialDao = applicationContext.getBean(IMaterialDocDao.class);
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
        MaterialDoc bean = new MaterialDoc();
        bean.setMaterialCode("testCode" + tag.toString());
        bean.setBOM("bom");
        bean.setDocumentGrade("文档级别");
        bean.setIqcAgreement("质量协议");
        bean.setIqcCard("质量检验卡");
        bean.setIqcStandard("质检标准");
        bean.setPpapDocument("ppap文档");
        bean.setSpecification("spec");
        bean.setStatus("有效");

        materialDao.merge(bean);
    }

    @Test
    public void testSelect() {
        System.out.println("select");
        MaterialDoc bean = new MaterialDoc();
        String materialCode = "testCode"+tag.toString();
        bean.setMaterialCode(materialCode);
        MaterialDoc select = materialDao.select(bean);
        assertNotNull(select);
        assertEquals(select.getMaterialCode(), materialCode);
    }

}
