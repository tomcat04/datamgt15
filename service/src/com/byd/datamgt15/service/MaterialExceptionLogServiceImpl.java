/*
 * 本软件为比亚迪股份有限公司开发研制。未经本公司正式书面授权，其他任何个人、团体不得使用、复制、修改或发布本软件。
 * CopyRight © BYD Company Limited. All rights reserved.
 */
package com.byd.datamgt15.service;

import com.byd.datamgt15.dao.IMaterialExceptionLogDao;
import com.byd.datamgt15.domain.MaterialExceptionLog;
import com.byd.datamgt15.pojo.MaterialExceptionLogView;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @since 2014-05-21
 * @author Tian Yu <tian.yu5@byd.com>
 * @version V1.5
 */

public class MaterialExceptionLogServiceImpl implements IMaterialExceptionLogService {

    @Autowired
    private IMaterialExceptionLogDao materialExceptionLogDao = null;

    @Override
    public void add(MaterialExceptionLog materialExceptionLog) {
        materialExceptionLogDao.insert(materialExceptionLog);
    }

    @Override
    public void update(MaterialExceptionLog materialExceptionLog) {
        materialExceptionLogDao.merge(materialExceptionLog);
    }

    @Override
    public List<MaterialExceptionLogView> getList(String materialCode, Integer startNum, Integer endNum) {
        DetachedCriteria criteria = DetachedCriteria.forClass(MaterialExceptionLogView.class);
        criteria.add(Restrictions.eq("materialCode", materialCode));

        return materialExceptionLogDao.selectViewListByPage(criteria, startNum, endNum);
    }

}
