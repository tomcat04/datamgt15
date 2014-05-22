///*
// * 本软件为比亚迪股份有限公司开发研制。未经本公司正式书面授权，其他任何个人、团体不得使用、复制、修改或发布本软件。
// * CopyRight © BYD Company Limited. All rights reserved.
// */
//package com.byd.datamgt15.util;
//
//import java.beans.Introspector;
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.context.annotation.AnnotationBeanNameGenerator;
//import org.springframework.util.ClassUtils;
//
///**
// *
// * @since 2014-05-22
// * @author Tian Yu <tian.yu5@byd.com>
// * @version V1.5
// */
//public class ServiceNameGenerator extends AnnotationBeanNameGenerator {
//
//
//    @Override
//    protected String buildDefaultBeanName(BeanDefinition definition) {
//        String shortClassName = ClassUtils.getShortName(definition.getBeanClassName());
//        String returnName =  Introspector.decapitalize(shortClassName.replace("Impl", ""));
//        System.out.println(returnName);
//        return returnName;
//    }
//
//}
