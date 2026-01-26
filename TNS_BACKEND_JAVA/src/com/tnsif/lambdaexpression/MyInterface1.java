package com.tnsif.lambdaexpression;

import java.util.function.Predicate;

public class MyInterface1 {
	public static void main(String []args) {
				MyInterface myinf=()->System.out.println("This is print method");
				myinf.print();
				//predefined functional interface
				// predicate
				Predicate<Integer>p=n -> n%2==0;
				System.out.println(p.test(3));
				
			}
		}
	


