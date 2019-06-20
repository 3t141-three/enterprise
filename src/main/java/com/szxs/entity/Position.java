package com.sample;


public class Position {

  private long id;
  private String branch;
  private String recruit;
  private String positionName;
  private String positionCode;
  private String positionClassify;
  private String fegisterName;
  private java.sql.Date beginTime;
  private java.sql.Date finish;
  private String depict;
  private String ask;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }


  public String getRecruit() {
    return recruit;
  }

  public void setRecruit(String recruit) {
    this.recruit = recruit;
  }


  public String getPositionName() {
    return positionName;
  }

  public void setPositionName(String positionName) {
    this.positionName = positionName;
  }


  public String getPositionCode() {
    return positionCode;
  }

  public void setPositionCode(String positionCode) {
    this.positionCode = positionCode;
  }


  public String getPositionClassify() {
    return positionClassify;
  }

  public void setPositionClassify(String positionClassify) {
    this.positionClassify = positionClassify;
  }


  public String getFegisterName() {
    return fegisterName;
  }

  public void setFegisterName(String fegisterName) {
    this.fegisterName = fegisterName;
  }


  public java.sql.Date getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(java.sql.Date beginTime) {
    this.beginTime = beginTime;
  }


  public java.sql.Date getFinish() {
    return finish;
  }

  public void setFinish(java.sql.Date finish) {
    this.finish = finish;
  }


  public String getDepict() {
    return depict;
  }

  public void setDepict(String depict) {
    this.depict = depict;
  }


  public String getAsk() {
    return ask;
  }

  public void setAsk(String ask) {
    this.ask = ask;
  }

}
