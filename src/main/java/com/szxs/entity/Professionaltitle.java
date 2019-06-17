package com.szxs.entity;


public class Professionaltitle {

  private Integer id;
  private String professionalTitleCode;
  private String professionalTitleName;
  private Integer departmentId;
  private String depict;
  private String remarks;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getProfessionalTitleCode() {
    return professionalTitleCode;
  }

  public void setProfessionalTitleCode(String professionalTitleCode) {
    this.professionalTitleCode = professionalTitleCode;
  }

  public String getProfessionalTitleName() {
    return professionalTitleName;
  }

  public void setProfessionalTitleName(String professionalTitleName) {
    this.professionalTitleName = professionalTitleName;
  }

  public Integer getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(Integer departmentId) {
    this.departmentId = departmentId;
  }

  public String getDepict() {
    return depict;
  }

  public void setDepict(String depict) {
    this.depict = depict;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }
}
