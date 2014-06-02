/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.byd.datamgt15.service;

import com.byd.datamgt15.dao.IMaterialDao;
import com.byd.datamgt15.domain.MaterialDoc;
import com.byd.datamgt15.pojo.MaterialFullInfoView;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tian Yu <tian.yu5@byd.com>
 */
@Service
public class MaterialServiceImpl implements IMaterialService {

    @Autowired
    private final IMaterialDao materialDao = null;

    @Override
    public List<MaterialFullInfoView> getMaterialFullInfos(DetachedCriteria detachedCriteria, Integer startNum, Integer endNum) {
        if (detachedCriteria == null) {
            detachedCriteria = DetachedCriteria.forClass(MaterialFullInfoView.class);
        }
        return materialDao.selectViewListByPage(detachedCriteria, startNum, endNum);
    }

    @Override
    public Integer countMaterialFullInfos(DetachedCriteria detachedCriteria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addMaterialFullInfo(MaterialFullInfoView materialFullInfo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void importMaterialFullInfos(List<MaterialFullInfoView> materialFullInfos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MaterialDoc getMaterialDoc(String materialCode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
