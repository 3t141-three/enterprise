package com.sample;


public class Professionaltitle {

  private long id;
  private String professionalTitleCode;
  private String professionalTitleName;
  private long departmentId;
  private String depict;
  private String remarks;


  public long getId() {
    return id;
  }

  public void setId(long id) {
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


  public long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(long departmentId) {
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
