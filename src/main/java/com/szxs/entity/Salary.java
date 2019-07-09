package com.szxs.entity;
import java.io.Serializable;
import java.sql.Date;

public class Salary implements Serializable {
  private Integer id;//id
  private String salaryCode;//薪酬标准编号
  private String salaryName;//薪酬标准名称
  private double salarySum;//薪酬总额
  private String layDown;//制定人
  private String register;//登记人
  private Date registerTime;//登记时间
  private String change;//变更原因
  private double basic;//基本工资
  private double performance;//绩效工资
  private double travel;//交通补助
  private double phoneAllowance;//通讯补助
  private double mealAllowance;//餐补
  private double housingAllowance;//住房补助
  private double travelAllowance;//出差补助
  private double overtimePremium;//加班补助

  public Salary(Integer id, String salaryCode, String salaryName, double salarySum, String layDown, String register, Date registerTime, String change, double basic, double performance, double travel, double phoneAllowance, double mealAllowance, double housingAllowance, double travelAllowance, double overtimePremium) {
    this.id = id;
    this.salaryCode = salaryCode;
    this.salaryName = salaryName;
    this.salarySum = salarySum;
    this.layDown = layDown;
    this.register = register;
    this.registerTime = registerTime;
    this.change = change;
    this.basic = basic;
    this.performance = performance;
    this.travel = travel;
    this.phoneAllowance = phoneAllowance;
    this.mealAllowance = mealAllowance;
    this.housingAllowance = housingAllowance;
    this.travelAllowance = travelAllowance;
    this.overtimePremium = overtimePremium;
  }

  @Override
  public String toString() {
    return "Salary{" +
            "id=" + id +
            ", salaryCode='" + salaryCode + '\'' +
            ", salaryName='" + salaryName + '\'' +
            ", salarySum=" + salarySum +
            ", layDown='" + layDown + '\'' +
            ", register='" + register + '\'' +
            ", registerTime=" + registerTime +
            ", change='" + change + '\'' +
            ", basic=" + basic +
            ", performance=" + performance +
            ", travel=" + travel +
            ", phoneAllowance=" + phoneAllowance +
            ", mealAllowance=" + mealAllowance +
            ", housingAllowance=" + housingAllowance +
            ", travelAllowance=" + travelAllowance +
            ", overtimePremium=" + overtimePremium +
            '}';
  }

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

  public Salary() {

  }

  public Salary(String salaryCode, String salaryName, Date registerTime) {
    this.salaryCode = salaryCode;
    this.salaryName = salaryName;
    this.registerTime = registerTime;
  }
}


