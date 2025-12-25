package com.tnsif.demo.day3;

import com.tnsif.demo.day3.Employee;

public class Employeedemo {

	public static void main(String[] args) {
	
			Employee e=new Employee();
		   
			e.setename("Sahana");
			e.seteid(29);
			e.setesalary(20000);
			e.setecity("Hyderabad");
			e.setedepartment("Testing");
			System.out.println("ename:"+e.getename());
			System.out.println("eid:"+e.geteid());
			System.out.println("esalary:"+e.getesalary());
			System.out.println("ecity:"+e.getecity());
		    System.out.println("edepartment:"+e.getedepartment());
				}
}
