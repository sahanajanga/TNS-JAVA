package com.tnsif.assignments.test4;

public class NestedTry {

	public static void main(String[] args) {
		try { 
			int a=8;
			int b=0;
			try {
				int arr[] = {1,2,3,4};
				System.out.println(arr[4]);
				
			}
			catch (ArrayIndexOutOfBoundsException e){
					System.out.println("Inner try : Array Index Out of range");
					
				}
			int c=a/b;
			System.out.println(c);
			}
			catch (ArithmeticException e) {
				System.out.println("Outer try : Can not divide by zero");
		}

	}

}
