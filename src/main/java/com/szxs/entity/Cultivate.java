package com.szxs.entity;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Cultivate {


  private Integer id;
  private String cultivateName;
  private String cultivateTeacher;
  @DateTimeFormat(pattern="yyyy-MM-dd")
  private Date beginTime;
  @DateTimeFormat(pattern="yyyy-MM-dd")
  private Date finish;
  private String purpose;
  private String result;
  private String participant;
  private String introduce;
  private String means;
  private String cultivateExamine;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCultivateName() {
    return cultivateName;
  }

  public void setCultivateName(String cultivateName) {
    this.cultivateName = cultivateName;
  }

  public String getCultivateTeacher() {
    return cultivateTeacher;
  }

  public void setCultivateTeacher(String cultivateTeacher) {
    this.cultivateTeacher = cultivateTeacher;
  }

  public Date getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(Date beginTime) {
    this.beginTime = beginTime;
  }

  public Date getFinish() {
    return finish;
  }

  public void setFinish(Date finish) {
    this.finish = finish;
  }

  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public String getParticipant() {
    return participant;
  }

  public void setParticipant(String participant) {
    this.participant = participant;
  }

  public String getIntroduce() {
    return introduce;
  }

  public void setIntroduce(String introduce) {
    this.introduce = introduce;
  }

  public String getMeans() {
    return means;
  }

  public void setMeans(String means) {
    this.means = means;
  }

  public String getCultivateExamine() {
    return cultivateExamine;
  }

  public void setCultivateExamine(String cultivateExamine) {
    this.cultivateExamine = cultivateExamine;
  }
}
