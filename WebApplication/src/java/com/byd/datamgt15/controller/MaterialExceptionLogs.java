/*
 * 本软件为比亚迪股份有限公司开发研制。未经本公司正式书面授权，其他任何个人、团体不得使用、复制、修改或发布本软件。
 * CopyRight © BYD Company Limited. All rights reserved.
 */
package com.byd.datamgt15.controller;

import com.byd.datamgt15.domain.MaterialExceptionLog;
import com.byd.datamgt15.util.PageReturnBean;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @since 2014-05-20
 * @author Tian Yu <tian.yu5@byd.com>
 * @version V1.5
 */
@Controller
@RequestMapping("/MaterialExceptionLogs")
public class MaterialExceptionLogs {

    @RequestMapping(value = "", method = RequestMethod.GET, params = {"materialCode", "page", "start", "limit"})
    public @ResponseBody PageReturnBean getDatas(@RequestParam("materialCode") String materialCode, @RequestParam("page") String page,
            @RequestParam("start") String start, @RequestParam("limit") String limit) {
        
        MaterialExceptionLog materialExceptionLog  = new MaterialExceptionLog();
        List datas =  new ArrayList();
        datas.add(materialExceptionLog);
        PageReturnBean pageReturnBean = new PageReturnBean();
        
        pageReturnBean.setTotal(1);
        pageReturnBean.setDatas(datas);
        return pageReturnBean;
    }
    

}
