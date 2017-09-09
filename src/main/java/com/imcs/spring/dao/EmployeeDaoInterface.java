package com.imcs.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.imcs.spring.beans.Employee;

@Repository
public interface EmployeeDaoInterface {

	List<Employee> getEmpByDeptNo(int deptNo, String orderby);

	List<Employee> getEmployeeByDeptNo(int deptNo);

	Employee getEmployee(int empNo, int deptNo);

	int addEmployee(Employee employee);

	void deleteEmployee(int empNo);

	void updateEmployee(Employee employee);

	Employee getEmployee(int empNo);
}
