/*
 * 本软件为比亚迪股份有限公司开发研制。未经本公司正式书面授权，其他任何个人、团体不得使用、复制、修改或发布本软件。
 * CopyRight © BYD Company Limited. All rights reserved.
 */
package com.byd.datamgt15.controller;

import com.byd.datamgt15.pojo.MaterialExceptionLogView;
import com.byd.datamgt15.service.IMaterialExceptionLogService;
import com.byd.datamgt15.util.PageReturnBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
public class MaterialExceptionLogsController {

    @Autowired
    private final IMaterialExceptionLogService materialExceptionLogService = null;

    @RequestMapping(value = "", method = RequestMethod.GET, params = {"materialCode", "page", "start", "limit"})
    public @ResponseBody
    PageReturnBean getDatas(@RequestParam("materialCode") String materialCode,
            @RequestParam("page") String page, @RequestParam("start") String start, @RequestParam("limit") String limit) {

        Integer startInt = Integer.valueOf(start);
        Integer limitInt = Integer.valueOf(limit);
        List<MaterialExceptionLogView> list = materialExceptionLogService.getList(materialCode, startInt, startInt + limitInt - 1);

        PageReturnBean pageReturnBean = new PageReturnBean();

        pageReturnBean.setTotal(list.size());
        pageReturnBean.setDatas(list);
        return pageReturnBean;
    }

}
