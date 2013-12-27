/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package com.byd.datamgt15.domain;

import java.util.Date;

/**
 *
 * @author ty
 */
public class MaterialExceptionLog {

    int id;
    String material_code;
    Date log_time;
    String batch;
    String exception_desc;
    String deal_desc;
    String status;

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

    public Date getLog_time() {
        return log_time;
    }

    public void setLog_time(Date log_time) {
        this.log_time = log_time;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getException_desc() {
        return exception_desc;
    }

    public void setException_desc(String exception_desc) {
        this.exception_desc = exception_desc;
    }

    public String getDeal_desc() {
        return deal_desc;
    }

    public void setDeal_desc(String deal_desc) {
        this.deal_desc = deal_desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
