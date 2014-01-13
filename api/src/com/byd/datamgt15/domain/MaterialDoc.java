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
    String materialCode;
    String documentGrade;
    String status;
    String BOM;
    String iqcStandard;
    String iqcCard;
    String specification;
    String iqcAgreement;
    String ppapDocument;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public String getDocumentGrade() {
        return documentGrade;
    }

    public void setDocumentGrade(String documentGrade) {
        this.documentGrade = documentGrade;
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

    public String getIqcStandard() {
        return iqcStandard;
    }

    public void setIqcStandard(String iqcStandard) {
        this.iqcStandard = iqcStandard;
    }

    public String getIqcCard() {
        return iqcCard;
    }

    public void setIqcCard(String iqcCard) {
        this.iqcCard = iqcCard;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getIqcAgreement() {
        return iqcAgreement;
    }

    public void setIqcAgreement(String iqcAgreement) {
        this.iqcAgreement = iqcAgreement;
    }

    public String getPpapDocument() {
        return ppapDocument;
    }

    public void setPpapDocument(String ppapDocument) {
        this.ppapDocument = ppapDocument;
    }

   
    
}
