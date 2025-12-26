package com.tnsif.inheritance.hybrid;

public class ClassA {
	public void display() {
		System.out.println( "A Class Method ");
		
	}
}
class ClassB extends ClassA {
	public void show() {
		System.out.println("B Class method");
	}
}
class ClassC extends ClassB {
	public void print() {
		System.out.println("C Class method");
	}
}
class ClassD extends ClassA{
	public void show() {
		System.out.println("D Class method");
	}
}
class ClassE extends ClassA{
	public void show() {
		System.out.println("E Class method");
	}
}
