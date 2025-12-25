package com.tnsif.accessmodifiers.samepackage;

public class NonSubClass {
	public void display() {
		System.out.println("Different Class in Same Package");
		AccessModifiers obj=new AccessModifiers();
		System.out.println("b="+obj.b);
		System.out.println("c="+obj.c);
		System.out.println("d="+obj.d);
	}

}
