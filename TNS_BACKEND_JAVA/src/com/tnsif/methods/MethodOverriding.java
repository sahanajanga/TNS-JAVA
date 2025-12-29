package com.tnsif.methods;

public class MethodOverriding {
	public void hello() {
		System.out.println("parent class ");
	}

}
class Demo extends MethodOverriding {

public void hello() {
	System.out.println("child class ");
}
}
