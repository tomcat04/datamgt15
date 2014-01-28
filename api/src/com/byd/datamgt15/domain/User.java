package com.byd.datamgt15.domain;

/**
 * 用户
 *
 * @author ty
 */
public class User {

    Integer id;
    String region;
    String userName; //should be unique
    String password;
    String email;
    String gender;
    String jobTitle;
    String phone;
    String mobilePhone;
    String organization;
    /**
     * 办公地点
     */
    String workingLocation;
    /**
     * 车间
     */

    String workshop;
    /**
     * 科室
     */
    String workingSection;
    
    String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getWorkingLocation() {
        return workingLocation;
    }

    public void setWorkingLocation(String workingLocation) {
        this.workingLocation = workingLocation;
    }

    public String getWorkshop() {
        return workshop;
    }

    public void setWorkshop(String workshop) {
        this.workshop = workshop;
    }

    public String getWorkingSection() {
        return workingSection;
    }

    public void setWorkingSection(String workingSection) {
        this.workingSection = workingSection;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   

}
