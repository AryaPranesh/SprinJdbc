package com.emp.dao;
import java.util.List;

import com.emp.model.Employee;
public interface EmpDAO {
	public abstract void createEmployee(Employee employee);
	public abstract Employee fetchEmployeeById(Integer employeeId);
	public abstract List<Employee> fetchAllEmployees();
	public abstract void updateEmployeeEmailById(String newEmail,Integer employeeId);
	public abstract void updateEmployeeDepartmentById(String department,Integer employeeId);
	public abstract void deleteEmployeeById(Integer employeeId);
}
