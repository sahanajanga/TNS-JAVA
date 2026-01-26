package com.tnsif.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<Integer>li=Arrays.asList(11,12,33,54,59,73,45,88,12);
		li.stream().
		filter(n->n%3==0).
		forEach(System.out::println);
	}

}
