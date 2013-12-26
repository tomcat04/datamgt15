

package com.byd.datamgt15.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ty
 */
@Controller
public class IndexController {
    @RequestMapping(value = "index")
    public String redirect(){
        return "index";
    }
}
