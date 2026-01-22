package com.tnsif.collections.list;
import java.util.Stack;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class StackExample {
    public static void main(String[] args) {

        
        Stack<Student> stack = new Stack<>();

        
        stack.push(new Student(1, "Sahana", 88));
        stack.push(new Student(2, "Gopi", 90));
        stack.push(new Student(3, "Sonu", 85));

        System.out.println("Students in Stack:");
        for (Student s : stack) {
            System.out.println(s.rollNo + " " + s.name + " " + s.marks);
        }

        
        Student topStudent = stack.peek();
        System.out.println("Top Student (Peek): "
                + topStudent.rollNo + " " + topStudent.name);

        
        Student removedStudent = stack.pop();
        System.out.println("Removed Student (Pop): "
                + removedStudent.rollNo + " " + removedStudent.name);

        
        System.out.println("Stack after pop:");
        for (Student s : stack) {
            System.out.println(s.rollNo + " " + s.name + " " + s.marks);
        }
    }
}
