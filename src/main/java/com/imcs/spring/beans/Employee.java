package com.imcs.spring.beans;

import java.util.Date;

public class Employee {
	private int EmpNo;
	private int deptNo;
	private float salary;
	private Date doB;
	private Date doJ;
	private int salaryGrade;
	private String status;

	public Employee() {
		super();
	}

	public Employee(int empNo, int deptNo, float salary, Date doB, Date doJ, int salaryGrade, String status) {
		super();
		EmpNo = empNo;
		this.deptNo = deptNo;
		this.salary = salary;
		this.doB = doB;
		this.doJ = doJ;
		this.salaryGrade = salaryGrade;
		this.status = status;
	}

	public Employee(int deptNo, float salary, Date doB, Date doJ, int salaryGrade) {
		super();
		this.deptNo = deptNo;
		this.salary = salary;
		this.doB = doB;
		this.doJ = doJ;
		this.salaryGrade = salaryGrade;

	}

	public int getEmpNo() {
		return EmpNo;
	}

	public void setEmpNo(int empNo) {
		EmpNo = empNo;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Date getDoJ() {
		return doJ;
	}

	public void setDoJ(Date doJ) {
		this.doJ = doJ;
	}

	public int getSalaryGrade() {
		return salaryGrade;
	}

	public void setSalaryGrade(int salaryGrade) {
		this.salaryGrade = salaryGrade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDoB() {
		return doB;
	}

	public void setDoB(Date doB) {
		this.doB = doB;
	}

}
