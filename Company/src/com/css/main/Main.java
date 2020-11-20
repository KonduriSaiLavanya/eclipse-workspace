package com.css.main;
import com.css.dto.Department;
import com.css.dto.Employee;
import com.css.exceptions.EmployeeNotFoundException;


public class Main {
	public static void main(String[] args)
	{
		Employee employee1 = new Employee("lavanya",27,"lavanya@gmail.com",101,23454,"developer",78);
		Employee employee2 = new Employee("honey",23,"honey@gmail.com",102,35000,"java developer",87);
		Employee employee3 = new Employee("anu",26,"anuradha@gmail.com",103,90000,"tester",76);
		Department department = new Department(11,"PSO");
		
		System.out.println("recruit first employee :"+department.recruitEmployee(employee1));
		System.out.println("recruit second employee :"+department.recruitEmployee(employee2));
		System.out.println("recruit third employee :"+department.recruitEmployee(employee3));
		try {
			System.out.println(department.searchEmployee(201));
		}
			catch(EmployeeNotFoundException e){
				e.printStackTrace();
				
			}
		try {
			System.out.println(department.updateEmployee(201,"hasleen@gmail.com"));
		} catch (EmployeeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		try {
			System.out.println(department.searchEmployee(201));
		}
			catch(EmployeeNotFoundException e){
				e.printStackTrace();
				
			}
		System.out.println(department.getEmployees().toString());
		try {
			System.out.println(department.releaseEmployee(202));
		} catch (EmployeeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(department.getEmployees().toString());
	}

}
