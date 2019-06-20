package com.sample;


public class Organization {

  private long id;
  private String code;
  private String call;
  private String organizationName;
  private String higherLevel;
  private String address;
  private String briefIntroduction;
  private String remarks;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public String getCall() {
    return call;
  }

  public void setCall(String call) {
    this.call = call;
  }


  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }


  public String getHigherLevel() {
    return higherLevel;
  }

  public void setHigherLevel(String higherLevel) {
    this.higherLevel = higherLevel;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getBriefIntroduction() {
    return briefIntroduction;
  }

  public void setBriefIntroduction(String briefIntroduction) {
    this.briefIntroduction = briefIntroduction;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

}
