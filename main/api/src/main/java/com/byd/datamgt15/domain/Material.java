/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.domain;

/**
 *
 * @author ty
 */
public class Material {

    Integer id;
    String materialCode;
    String materialDesc;

    byte[] image;
    String QMS;
    
    /**
     * 适用项目
     */
    String itemFor;

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

    public String getItemFor() {
        return itemFor;
    }

    public void setItemFor(String itemFor) {
        this.itemFor = itemFor;
    }

   
}
