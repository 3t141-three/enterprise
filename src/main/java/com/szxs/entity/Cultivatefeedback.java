package com.szxs.entity;

public class Cultivatefeedback {

  private Integer id;
  private Integer cultivateId;
  private String result;
  private String sumUp;
  private String examine;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getCultivateId() {
    return cultivateId;
  }

  public void setCultivateId(Integer cultivateId) {
    this.cultivateId = cultivateId;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public String getSumUp() {
    return sumUp;
  }

  public void setSumUp(String sumUp) {
    this.sumUp = sumUp;
  }

  public String getExamine() {
    return examine;
  }

  public void setExamine(String examine) {
    this.examine = examine;
  }
}
