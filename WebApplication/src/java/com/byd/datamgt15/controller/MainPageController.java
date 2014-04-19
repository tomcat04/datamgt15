/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ty
 */
@Controller
public class MainPageController {

    @RequestMapping(value = "/mainpage")
    public String redirect() {
        return "mainpage";
    }
    
    @RequestMapping(value = "/")
    public String redirectDefault() {
        return "mainpage";
    }
}
