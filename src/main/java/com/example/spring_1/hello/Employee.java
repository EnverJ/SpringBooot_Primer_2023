package com.example.spring_1.hello;

import lombok.Data;

@Data
public class Employee {
  private String employeeId;
  private String employeeName;
  private String employeeAge;

  public String getEmployeeId() {
    return this.employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getEmployeeName() {
    return this.employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public String getEmployeeAge() {
    return this.employeeAge;
  }

  public void setEmployeeAge(String employeeAge) {
    this.employeeAge = employeeAge;
  }
}
