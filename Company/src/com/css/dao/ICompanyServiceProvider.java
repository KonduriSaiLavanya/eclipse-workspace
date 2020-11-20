package com.css.dao;

import com.css.dto.Employee;
import com.css.exceptions.EmployeeNotFoundException;

public interface ICompanyServiceProvider{
		
		public boolean recruitEmployee(Employee newEmployee);
		public boolean releaseEmployee(int employeeID) throws EmployeeNotFoundException;
		public boolean updateEmployee(int employeeID,String email)throws EmployeeNotFoundException;;
		public Employee searchEmployee(int employeeID)throws EmployeeNotFoundException;;
	}
	
	
	

