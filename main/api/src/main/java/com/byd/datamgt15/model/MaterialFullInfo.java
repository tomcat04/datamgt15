/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

package com.byd.datamgt15.model;

/**
 *
 * @author ty
 */
public class MaterialFullInfo {
    /**
     * @see com.byd.datamgt15.domain.MaterialVendorInfo 's id
     */
    int id;
    /**
     * 编号
     * */
    String recordId;
    String materialCode;
    String materialDesc;
    String materialDesc2;
    byte[] image;
    String QMS;
    String vendorCode;
    String vendorName;
    String brand;
    String vendorGrade;
    String phone;
    String mobilePhone;
    String email;
    String deliveryCycle;
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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getQMS() {
        return QMS;
    }

    public void setQMS(String QMS) {
        this.QMS = QMS;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
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

    public String getVendorGrade() {
        return vendorGrade;
    }

    public void setVendorGrade(String vendorGrade) {
        this.vendorGrade = vendorGrade;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
