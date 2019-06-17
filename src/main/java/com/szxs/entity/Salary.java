package com.szxs.entity;


import java.util.Date;

public class Salary {

  private Integer id;
  private String salaryCode;
  private String salaryName;
  private double salarySum;
  private String layDown;
  private String register;
  private Date registerTime;
  private String change;
  private double basic;
  private double performance;
  private double travel;
  private double phoneAllowance;
  private double mealAllowance;
  private double housingAllowance;
  private double travelAllowance;
  private double overtimePremium;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getSalaryCode() {
    return salaryCode;
  }

  public void setSalaryCode(String salaryCode) {
    this.salaryCode = salaryCode;
  }

  public String getSalaryName() {
    return salaryName;
  }

  public void setSalaryName(String salaryName) {
    this.salaryName = salaryName;
  }

  public double getSalarySum() {
    return salarySum;
  }

  public void setSalarySum(double salarySum) {
    this.salarySum = salarySum;
  }

  public String getLayDown() {
    return layDown;
  }

  public void setLayDown(String layDown) {
    this.layDown = layDown;
  }

  public String getRegister() {
    return register;
  }

  public void setRegister(String register) {
    this.register = register;
  }

  public Date getRegisterTime() {
    return registerTime;
  }

  public void setRegisterTime(Date registerTime) {
    this.registerTime = registerTime;
  }

  public String getChange() {
    return change;
  }

  public void setChange(String change) {
    this.change = change;
  }

  public double getBasic() {
    return basic;
  }

  public void setBasic(double basic) {
    this.basic = basic;
  }

  public double getPerformance() {
    return performance;
  }

  public void setPerformance(double performance) {
    this.performance = performance;
  }

  public double getTravel() {
    return travel;
  }

  public void setTravel(double travel) {
    this.travel = travel;
  }

  public double getPhoneAllowance() {
    return phoneAllowance;
  }

  public void setPhoneAllowance(double phoneAllowance) {
    this.phoneAllowance = phoneAllowance;
  }

  public double getMealAllowance() {
    return mealAllowance;
  }

  public void setMealAllowance(double mealAllowance) {
    this.mealAllowance = mealAllowance;
  }

  public double getHousingAllowance() {
    return housingAllowance;
  }

  public void setHousingAllowance(double housingAllowance) {
    this.housingAllowance = housingAllowance;
  }

  public double getTravelAllowance() {
    return travelAllowance;
  }

  public void setTravelAllowance(double travelAllowance) {
    this.travelAllowance = travelAllowance;
  }

  public double getOvertimePremium() {
    return overtimePremium;
  }

  public void setOvertimePremium(double overtimePremium) {
    this.overtimePremium = overtimePremium;
  }
}
