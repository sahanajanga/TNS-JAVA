package com.tnsif.lambdaexpression;
import java.util.function.Supplier;
public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Double>s=()->Math.random();
		System.out.println(s.get());

	}

}
