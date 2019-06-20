package com.sample;


public class Cultivate {

  private long id;
  private String cultivateName;
  private String cultivateTeacher;
  private java.sql.Timestamp beginTime;
  private java.sql.Timestamp finish;
  private String purpose;
  private String participant;
  private String introduce;
  private String means;
  private String cultivateExamine;


  public long getId() {
    return id;
  }

  public void setId(long id) {
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


  public java.sql.Timestamp getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(java.sql.Timestamp beginTime) {
    this.beginTime = beginTime;
  }


  public java.sql.Timestamp getFinish() {
    return finish;
  }

  public void setFinish(java.sql.Timestamp finish) {
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
