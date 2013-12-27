/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.domain;

/**
 *
 * @author ty
 */
public class MaterialDoc {

    int id;
    String material_code;
    String document_grade;
    String status;
    String BOM;
    String iqc_Standard;
    String iqc_card;
    String specification;
    String iqc_Agreement;
    String ppap_document;

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

    public String getDocument_grade() {
        return document_grade;
    }

    public void setDocument_grade(String document_grade) {
        this.document_grade = document_grade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBOM() {
        return BOM;
    }

    public void setBOM(String BOM) {
        this.BOM = BOM;
    }

    public String getIqc_Standard() {
        return iqc_Standard;
    }

    public void setIqc_Standard(String iqc_Standard) {
        this.iqc_Standard = iqc_Standard;
    }

    public String getIqc_card() {
        return iqc_card;
    }

    public void setIqc_card(String iqc_card) {
        this.iqc_card = iqc_card;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getIqc_Agreement() {
        return iqc_Agreement;
    }

    public void setIqc_Agreement(String iqc_Agreement) {
        this.iqc_Agreement = iqc_Agreement;
    }

    public String getPpap_document() {
        return ppap_document;
    }

    public void setPpap_document(String ppap_document) {
        this.ppap_document = ppap_document;
    }
    
    
}
