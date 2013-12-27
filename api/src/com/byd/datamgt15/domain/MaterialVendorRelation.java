/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

package com.byd.datamgt15.domain;

/**
 * 物料供应商关系
 * @author ty
 */
public class MaterialVendorRelation {
    
    int id ;
    /**
     * 编号
     */
    String recordId;
    
    String materialCode;
    
    String vendorCode;

    /**
     * (物料)原厂描述
     */
    String materialDesc2;
    
    /**
     * 交货周期
     */
    String deliveryCycle;
    
    /**
     * 供货状态
     */
    String deliveryStatus;
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getMaterialDesc2() {
        return materialDesc2;
    }

    public void setMaterialDesc2(String materialDesc2) {
        this.materialDesc2 = materialDesc2;
    }

    public String getDeliveryCycle() {
        return deliveryCycle;
    }

    public void setDeliveryCycle(String deliveryCycle) {
        this.deliveryCycle = deliveryCycle;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    
    
}
