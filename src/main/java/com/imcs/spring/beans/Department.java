package com.imcs.spring.beans;

public class Department {
	private int deptNo;
	private String deptName;

	/**
	 * @param deptNo
	 * @param deptName
	 */
	public Department(int deptNo, String deptName) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
