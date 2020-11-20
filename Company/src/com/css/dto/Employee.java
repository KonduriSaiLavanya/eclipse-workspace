package com.css.dto;
public class Employee extends Person{
	static int empID=201;
	private int deptmentNumber ;
	private int employeeID;
	private double salary;
	private String designation;
	private double performance;	
	private Person[] Persons;
	
	/**
	 * @return the empID
	 */
	public static int getEmpID() {
		return empID;
	}

	/**
	 * @param empID the empID to set
	 */
	public static void setEmpID(int empID) {
		Employee.empID = empID;
	}
	/**
	 * @return the deptmentNumber
	 */
	public int getDeptmentNumber() {
		return deptmentNumber;
	}
	/**
	 * @param deptmentNumber the deptmentNumber to set
	 */
	public void setDeptmentNumber(int deptmentNumber) {
		this.deptmentNumber = deptmentNumber;
	}
	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}
	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
    /**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the performance
	 */
	public double getPerformance() {
		return performance;
	}
	/**
	 * @param performance the performance to set
	 */
	public void setPerformance(double performance) {
		this.performance = performance;
	}
	/**
	 * @return the persons
	 */
	public Person[] getPersons() {
		return Persons;
	}
	/**
	 * @param persons the persons to set
	 */
	public void setPersons(Person[] persons) {
		Persons = persons;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public Employee(String name, int age, String email,int deptmentNumber,double salary, String designation, double performance) {
		super(name, age, email);
		this.deptmentNumber = deptmentNumber;
		this.employeeID = empID;
		empID++;
		this.salary = salary;
		this.designation = designation;
		this.performance = performance;
	}

	@Override
	public String toString() {
		return "Employee [deptmentNumber=" + deptmentNumber + ", employeeID=" + employeeID + ", salary=" + salary
				+ ", designation=" + designation + ", performance=" + performance + ", toString()=" + super.toString() + "]";
	}	
}


