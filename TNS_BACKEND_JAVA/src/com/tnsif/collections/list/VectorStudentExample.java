package com.tnsif.collections.list;
import java.util.Vector;
class Students{
	    int rollNo;
	    String name;
	    int marks;

	    Students(int rollNo, String name, int marks) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.marks = marks;
	    }
	}
	

	public class VectorStudentExample {
	    public static void main(String[] args) {

	      Vector<Student> students = new Vector<>();

	        students.add(new Student(1, "Sahana", 85));
	        students.add(new Student(2, "Sravani", 90));
	        students.add(new Student(3, "Gopinadh", 88));

	        System.out.println("Student List:");
	        for (Student s : students) {
	            System.out.println(s.rollNo + " " + s.name + " " + s.marks);
	        }

	        
	        Student s = students.get(1);
	        System.out.println("Student at index 1:");
	        System.out.println(s.rollNo + " " + s.name + " " + s.marks);

	        

	        System.out.println("Student List After Removal:");
	        for (Student stu : students) {
	            System.out.println(stu.rollNo + " " + stu.name + " " + stu.marks);
	        }
	    }
	}
