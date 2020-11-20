package com.css.Assessment12;

import java.util.ArrayList;

public class Employee {
    private String name;
    private String departmentNo;
    private String status;
    public Employee(String name, String department, String status) {
        this.setName(name);
        this.setDepartment(name);
        this.setStatus(status);
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return departmentNo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(String department) {
        this.departmentNo = department;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


public static void main(String[] args)
{

ArrayList<Employee> listEmployee = new ArrayList<Employee>();
listEmployee.add(new Employee("Ravi", "IT", "active"));
listEmployee.add(new Employee("Tom", "Sales", "inactive"));
listEmployee.add(new Employee("Kanna", "IT", "inactive"));


int count = 0;
for (Employee e : listEmployee) {
    count++;
}
System.out.println("Count of Employees" + count);
}
}