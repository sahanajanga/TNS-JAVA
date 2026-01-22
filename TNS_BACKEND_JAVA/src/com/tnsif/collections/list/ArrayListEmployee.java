package com.tnsif.collections.list;
import java.util.ArrayList;

	class Employee {
	    int empId;
	    String empName;
	    double salary;
 Employee(int empId, String empName, double salary) {
	        this.empId = empId;
	        this.empName = empName;
	        this.salary = salary;
	    }
	}
	public class ArrayListEmployee {
	    public static void main(String[] args) {
          ArrayList<Employee> el= new ArrayList<>();
            el.add( new Employee(101, "Sahana", 50000));
	        el.add( new Employee(102, "Gopi", 60000));
	        el.add( new Employee(103, "Chikky", 55000));

	        
	        Employee e = el.get(1);
	        System.out.println("Employee ID: " + e.empId);
	        System.out.println("Employee Name: " + e.empName);
	        System.out.println("Employee Salary: " + e.salary);
	        el.remove(2); 
           System.out.println("Employee List After Removal:");
	        for (Employee emp : el) {
	            System.out.println(emp.empId + " " + emp.empName + " " + emp.salary);
	        }
	   }
}
