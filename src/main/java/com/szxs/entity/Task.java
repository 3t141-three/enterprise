package com.szxs.entity;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Task {

  private Integer id;
  private String taskName;
  private Integer typeid;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private String  arrive;




  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public Integer getTypeid() {
    return typeid;
  }

  public void setTypeid(Integer typeid) {
    this.typeid = typeid;
  }

  public String getArrive() {
    return arrive;
  }

  public void setArrive(String arrive) {
    this.arrive = arrive;
  }
}
