package com.cg.project.beans;

public class Employee {
	private int empId, basicSalary;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Employee(int empId, int basicSalary, String empName) {
		super();
		this.empId = empId;
		this.basicSalary = basicSalary;
		this.empName = empName;
	}
	public Employee() {
		super();
		
	}
	
}
