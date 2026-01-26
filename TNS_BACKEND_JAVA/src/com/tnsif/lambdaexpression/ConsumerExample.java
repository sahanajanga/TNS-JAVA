package com.tnsif.lambdaexpression;
import java.util.function.Consumer;
public class ConsumerExample {

	public static void main(String[] args) {
		
		Consumer<String> c= (name) -> System.out.println(name.toUpperCase());


	c.accept("sahana");
	}
		}

		
		

