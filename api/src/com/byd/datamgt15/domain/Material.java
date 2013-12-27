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

    int id;
    String material_code;
    String material_desc;
    String material_desc2;
    byte[] image;
    String QMS;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaterial_code() {
        return material_code;
    }

    public void setMaterial_code(String material_code) {
        this.material_code = material_code;
    }

    public String getMaterial_desc() {
        return material_desc;
    }

    public void setMaterial_desc(String material_desc) {
        this.material_desc = material_desc;
    }

    public String getMaterial_desc2() {
        return material_desc2;
    }

    public void setMaterial_desc2(String material_desc2) {
        this.material_desc2 = material_desc2;
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
    
    
}
