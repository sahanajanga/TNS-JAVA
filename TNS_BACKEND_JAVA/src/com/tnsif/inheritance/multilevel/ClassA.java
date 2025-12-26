package com.tnsif.inheritance.multilevel;

public class ClassA {
	public void display() {
		System.out.println("A class method");
	}
	
	}
  class ClassB extends ClassA {
	  public void show() {
		  System.out.println("B class method");
		}
	  }
  class ClassC extends ClassB {
	  public void print() {
		  System.out.println("C class method");
		}
		
	  
  }
  

  