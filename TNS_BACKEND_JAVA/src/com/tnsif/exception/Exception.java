package com.tnsif.exception;

public class Exception {

	public static void main(String[] args) {
	try {
		int a,b;
		a=10;
		b=0;
		int c=a/b;
	}
	catch (ArithmeticException e) {
		System.out.println("The division is not possible");
		}

try {

int arr[]= {1,2,3,4,5,6,7,8};
System.out.println(arr[0]);
System.out.println(arr[3]);
System.out.println(arr[5]);
System.out.println(arr[7]);
System.out.println(arr[9]);
}
catch (ArrayIndexOutOfBoundsException e1 ) {
	System.out.println("You Can Not Read The Value Of arr[9]");
}
try { 
	String s=null;
	System.out.println(s.length());
}
catch (NullPointerException  e) {
	System.out.println("The String value is null");
}
}
}