package com.emp.user;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emp.model.Employee;
import com.emp.service.EmployeeService;
import com.emp.service.EmployeeServiceImpl;
public class User {
	public static void main(String[] args) {
		 
		AbstractApplicationContext ctx = null;
		try {
			ctx = new ClassPathXmlApplicationContext("web.xml");
			EmployeeService employeeService = ctx.getBean(EmployeeServiceImpl.class);
			//--------------------------------COMMENTS CAN BE REMOVED TO PERFORM  CRUD OPERATION IN DB----------------------------//
			//createEmployee(employeeService);----------------------------------->for creating new employee in DB
			getEmployeeById(employeeService);
			fetchAllEmployeesInfo(employeeService);
			//employeeService.updateEmployeeEmailById("sri123@gmail.com", 5);//----->for Updating email id by employeeId in DB
			//employeeService.updateEmployeeDepartmentById("Marketing", 9);//------->for Updating department name by employeeId in DB
			//employeeService.deleteEmployeeById(9);//-----------------------------> for deleting employee by means of employeeId in DB
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(ctx != null)
				ctx.close();
		}
	}
 
	private static void fetchAllEmployeesInfo(EmployeeService employeeService) {
		employeeService.getAllEmployees().forEach(System.out::println);
	}
 
	private static void getEmployeeById(EmployeeService employeeService) {
		Employee employee = employeeService.getEmployeeById(2);
		System.out.println(employee);
	}
 //-------------------------------FOR CREATING EMPLOYEE---------------------------------------//
	/*private static void createEmployee(EmployeeService employeeService) {
		Employee employee = getEmployee() ;
		employeeService.createEmployee(employee);
	}
 
	private static Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeName("VISHALAM");
		employee.setEmail("vishalam@gmail.com");
		employee.setDepartment("Accounts");
		employee.setSalary(55000.00);
		employee.setDutyTime("Night Shift");
		return employee;
	}*/
}
