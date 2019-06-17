package com.szxs.entity;


import java.util.Date;

public class Questions {

  private Integer id;
  private String questionsName;
  private String type;
  private String departmentName;
  private String grade;
  private String person;
  private Date time;
  private String question;
  private String remarks;
  private String appendix;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getQuestionsName() {
    return questionsName;
  }

  public void setQuestionsName(String questionsName) {
    this.questionsName = questionsName;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public String getPerson() {
    return person;
  }

  public void setPerson(String person) {
    this.person = person;
  }

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public String getAppendix() {
    return appendix;
  }

  public void setAppendix(String appendix) {
    this.appendix = appendix;
  }
}
