package com.byd.datamgt15.controller;

import com.byd.datamgt15.pojo.MaterialFullInfoView;
import com.byd.datamgt15.service.IMaterialService;
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
 * @author Tian Yu <tian.yu5@byd.com>
 */
@Controller
@RequestMapping("/MaterialFullInfos")
public class MaterialFullInfoController {

    @Autowired
    private final IMaterialService materialService = null;

    @RequestMapping(value = "", method = RequestMethod.GET, params = {"page", "start", "limit"})
    public @ResponseBody
    PageReturnBean getDatas(
            @RequestParam("page") String page, @RequestParam("start") String start, @RequestParam("limit") String limit) {

        Integer startInt = Integer.valueOf(start);
        Integer limitInt = Integer.valueOf(limit);

        List<MaterialFullInfoView> list = materialService.getMaterialFullInfos(null, startInt, limitInt);

        PageReturnBean pageReturnBean = new PageReturnBean();

        pageReturnBean.setTotal(list.size()); //TODO count
        pageReturnBean.setDatas(list);
        return pageReturnBean;
    }
}
