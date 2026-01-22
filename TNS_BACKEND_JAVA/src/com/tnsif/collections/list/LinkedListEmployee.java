package com.tnsif.collections.list;
import java.util.LinkedList;
class Employees {
    int empId;
    String empName;
    double salary;
Employees(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
}

public class LinkedListEmployee {
    public static void main(String[] args) {

        
        LinkedList<Employees> el = new LinkedList<>();

       
        el.add(new Employees(101, "Sahana", 50000));
        el.add(new Employees(102, "Gopi", 60000));
        el.add(new Employees(103, "Chikky", 55000));

   el.addFirst(new Employees(100, "Jyoshna", 65000));

        System.out.println("Employee List:");
        for (Employees emp : el) {
            System.out.println(emp.empId + " " + emp.empName + " " + emp.salary);
        }

       
        Employees e = el.get(2);
        System.out.println("\nEmployee at index 2:");
        System.out.println(e.empId + " " + e.empName + " " + e.salary);

        
        el.remove(2); 

        System.out.println("\nEmployee List After Removal:");
        for (Employees emp : el) {
            System.out.println(emp.empId + " " + emp.empName + " " + emp.salary);
        }
    }
}
