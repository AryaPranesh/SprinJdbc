package com.emp.map;
import java.sql.ResultSet;
import java.sql.SQLException;
 
import org.springframework.jdbc.core.RowMapper;

import com.emp.model.Employee;
public class EmployeeRowMapper implements RowMapper<Employee>{
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
		employee.setEmployeeName(rs.getString("EMPLOYEE_NAME"));
		employee.setEmail(rs.getString("EMAIL_ID"));
		employee.setDepartment(rs.getString("DEPARTMENT"));
		employee.setSalary(rs.getDouble("SALARY"));
		employee.setDutyTime(rs.getString("DUTY_TIME"));
		return employee;
	}
}
