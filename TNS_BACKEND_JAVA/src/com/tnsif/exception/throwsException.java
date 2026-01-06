package com.tnsif.exception;
import java.io.FileReader;
class ExceptionDemo {

	public  void show () throws ArithmeticException {
	try {
		int a=10,b=0;
	    int c=a/b;
	    System.out.println(c);
	}catch (ArithmeticException e) {
		System.out.println("This is catch Block");
	}
	finally {
		System.out.println("This is Finally Block");
	}
	
}
}
public class throwsException {
	public static void main(String []args) {
		ExceptionDemo t=new ExceptionDemo();
		t.show();
	}
}


