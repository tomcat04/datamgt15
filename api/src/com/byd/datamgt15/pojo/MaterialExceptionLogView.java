/*
 * 本软件为比亚迪股份有限公司开发研制。未经本公司正式书面授权，其他任何个人、团体不得使用、复制、修改或发布本软件。
 * CopyRight © BYD Company Limited. All rights reserved.
 */
package com.byd.datamgt15.pojo;

/**
 *
 * @since 2014-05-21
 * @author Tian Yu <tian.yu5@byd.com>
 * @version V1.5
 */
public class MaterialExceptionLogView {

    Integer id;
    String materialCode;
    String materialDesc;
    String materialDesc2;

    /**
     * 适用项目
     */
    String itemFor;
    String vendorName;
    String brand;
    String logTime;
    String batch;
    String exceptionDesc;
    String dealDesc;
    String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public String getMaterialDesc() {
        return materialDesc;
    }

    public void setMaterialDesc(String materialDesc) {
        this.materialDesc = materialDesc;
    }

    public String getMaterialDesc2() {
        return materialDesc2;
    }

    public void setMaterialDesc2(String materialDesc2) {
        this.materialDesc2 = materialDesc2;
    }

    public String getItemFor() {
        return itemFor;
    }

    public void setItemFor(String itemFor) {
        this.itemFor = itemFor;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getExceptionDesc() {
        return exceptionDesc;
    }

    public void setExceptionDesc(String exceptionDesc) {
        this.exceptionDesc = exceptionDesc;
    }

    public String getDealDesc() {
        return dealDesc;
    }

    public void setDealDesc(String dealDesc) {
        this.dealDesc = dealDesc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
