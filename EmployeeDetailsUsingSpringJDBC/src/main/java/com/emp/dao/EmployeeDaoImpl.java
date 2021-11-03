package com.emp.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.emp.map.EmployeeRowMapper;
import com.emp.model.Employee;
 
@Repository
public class EmployeeDaoImpl implements EmpDAO{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
 
	@Override
	public void createEmployee(Employee employee) {
		String SQL = "INSERT INTO EMPLOYEE(EMPLOYEE_NAME ,EMAIL_ID,DEPARTMENT,SALARY,DUTY_TIME) VALUES (?,?,?,?,?)";
		int update = getJdbcTemplate().update(SQL, employee.getEmployeeName(),employee.getEmail(),employee.getDepartment(),employee.getSalary(),employee.getDutyTime());
		if(update == 1) {
			System.out.println("EMPLOYEE IS INSERTED TO DATABASE");
		}
	}
 
	@Override
	public Employee fetchEmployeeById(Integer employeeId) {
		System.out.println("--------------FETCHING EMPLOYEES FROM DB BY MEANS OF EMPLOYEE_ID = "+employeeId+"----------------");
		
		String SQL = "SELECT * FROM EMPLOYEE WHERE EMPLOYEE_ID = ?";
		return getJdbcTemplate().queryForObject(SQL, new EmployeeRowMapper(), employeeId);
	}
	@Override
	public List<Employee> fetchAllEmployees() {
		System.out.println("--------------COMPLETE EMPLOYEE DETAILS PRESENT IN THE DB----------------------");
		System.out.println("\n");
		String SQL = "SELECT * FROM EMPLOYEE";
		return getJdbcTemplate().query(SQL, new EmployeeRowMapper());
	}
	@Override
	public void updateEmployeeEmailById(String newEmail, Integer employeeId) {
		System.out.println("UPDATING EMAIL_ID WHOSE EMPLOYEE_ID IS= "+employeeId);
		String SQL = "UPDATE EMPLOYEE SET EMAIL_ID= ? WHERE EMPLOYEE_ID = ?";
		int update = getJdbcTemplate().update(SQL, newEmail,employeeId);
		if(update == 1) {
			System.out.println("EMPLOYEE EMAIL_ID IS UPDATED FOR ID = "+employeeId);
		}
	}
	public void updateEmployeeDepartmentById(String department, Integer employeeId) {
		System.out.println("UPDATING DEPARTMENT WHOSE EMPLOYEE_ID IS= "+employeeId);
		String SQL = "UPDATE EMPLOYEE SET DEPARTMENT = ? WHERE EMPLOYEE_ID = ?";
		int update = getJdbcTemplate().update(SQL, department,employeeId);
		if(update == 1) {
			System.out.println("EMPLOYEE DEPARTMENT IS UPDATED FOR ID = "+employeeId);
		}
	}
	@Override
	public void deleteEmployeeById(Integer employeeId) {
		String SQL = "DELETE FROM EMPLOYEE WHERE EMPLOYEE_ID= ?";
		int update = getJdbcTemplate().update(SQL,employeeId);
		if(update == 1) {
			System.out.println("EMPLOYEE IS DELETED WITH EMPLOYEE_ID  = "+employeeId);
		}
	}
}
