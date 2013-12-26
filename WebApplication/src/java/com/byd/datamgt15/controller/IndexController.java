/*
 * 本软件为比亚迪股份有限公司开发研制。未经本公司正式书面授权，其他任何个人、团体不得使用、复制、修改或发布本软件。
 * CopyRight © BYD Company Limited. All rights reserved.
 */

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
