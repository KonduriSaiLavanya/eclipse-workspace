package com.css.dto;
import java.util.ArrayList;
import java.util.List;
import com.css.dao.ICompanyServiceProvider;
import com.css.exceptions.EmployeeNotFoundException;

public class Department implements ICompanyServiceProvider{
	
	private int deptmentID;
	private String deptmentName;

	public List<Employee> employees=new ArrayList<>();

	/**
	 * @return the deptmentID
	 */
	public int getDeptmentID() {
		return deptmentID;
	}

	/**
	 * @param deptmentID the deptmentID to set
	 */
	public void setDeptmentID(int deptmentID) {
		this.deptmentID = deptmentID;
	}

	/**
	 * @return the deptmentName
	 */
	public String getDeptmentName() {
		return deptmentName;
	}

	/**
	 * @param deptmentName the deptmentName to set
	 */
	public void setDeptmentName(String deptmentName) {
		this.deptmentName = deptmentName;
	}

	/**
	 * @return the employees
	 */
	public List<Employee> getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Department(int deptmentID, String deptmentName) {
		super();
		this.deptmentID = deptmentID;
		this.deptmentName = deptmentName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Department [deptmentID=" + deptmentID + ", deptmentName=" + deptmentName + "]";
	}

	/* (non-Javadoc)
	 * @see com.css.dao.ICompanyServiceProvider#recruitEmployee(com.css.dto.Employee)
	 */
	@Override
	public boolean recruitEmployee(Employee newEmployee) {
		// TODO Auto-generated method stub
		boolean recruitEmployee=false;
	    this.employees.add(newEmployee);
	    if(this.employees.contains(newEmployee))
	    	recruitEmployee=true;
		return recruitEmployee;
	}

	/* (non-Javadoc)
	 * @see com.css.dao.ICompanyServiceProvider#releaseEmployee(int)
	 */
	@Override
	public boolean releaseEmployee(int employeeID) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		boolean releaseEmployee=false;
		Employee foundEmployee = this.searchEmployee(employeeID);
			if(foundEmployee!=null)
			{
		       this.employees.remove(foundEmployee);
		       releaseEmployee=true;
			}
		  
		 return releaseEmployee;
	}


	/* (non-Javadoc)
	 * @see com.css.dao.ICompanyServiceProvider#updateEmployee(int, java.lang.String)
	 */
	@Override
	public boolean updateEmployee(int employeeID, String email) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		boolean updateEmployee=false;
		for(Employee emp:employees)
		if(emp!=null) {
			emp.setEmail(email);
			updateEmployee=true;
		}
		return updateEmployee;
	}

	/* (non-Javadoc)
	 * @see com.css.dao.ICompanyServiceProvider#searchEmployee(int)
	 */
	@Override
	public Employee searchEmployee(int employeeID) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
Employee foundEmployee =null;
		
		for(Employee emp1 : employees)
			if(emp1.getEmployeeID()==employeeID) {
				foundEmployee=emp1;
				break;
			}
		if(foundEmployee==null)
			throw new EmployeeNotFoundException();
		return foundEmployee;
	}

}