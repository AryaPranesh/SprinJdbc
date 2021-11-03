package com.emp.model;

public class Employee {
	private Integer employeeId;
	private String employeeName;
	private String email;
	private String Department;
	private Double salary;
	private String DutyTime;
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDutyTime() {
		return DutyTime;
	}
	public void setDutyTime(String dutyTime) {
		DutyTime = dutyTime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String Department) {
		this.Department = Department;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return " EMPLOYEE [EMPLOYEE_ID=" + employeeId + ", EMPLOYEE_NAME=" + employeeName + ", EMAIL_ID=" + email
				+ ", DEPARTMENT=" + Department + ", SALARY=" + salary + ",DUTYTIME=" + DutyTime+ "]";
	}
}
