package com.emp.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.emp.dao.EmpDAO;
import com.emp.model.Employee;
 
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmpDAO empDAO;
	
	public EmpDAO getEmpDAO() {
		return empDAO;
	}
	public void setEmpAO(EmpDAO empDAO) {
		this.empDAO = empDAO;
	}
 
	@Override
	public void createEmployee(Employee employee) {
		getEmpDAO().createEmployee(employee);
	}
 
	@Override
	public Employee getEmployeeById(Integer employeeId) {
		return getEmpDAO().fetchEmployeeById(employeeId);
	}
	@Override
	public List<Employee> getAllEmployees() {
		return getEmpDAO().fetchAllEmployees();
	}
	@Override
	public void updateEmployeeEmailById(String newEmail, Integer employeeId) {
		getEmpDAO().updateEmployeeEmailById(newEmail, employeeId);
	}
	public  void updateEmployeeDepartmentById(String department,Integer employeeId) {
		getEmpDAO().updateEmployeeDepartmentById(department, employeeId);
	}
	@Override
	public void deleteEmployeeById(Integer employeeId) {
		getEmpDAO().deleteEmployeeById(employeeId);
		
	}
}
