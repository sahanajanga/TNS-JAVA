package com.tnsif.assignments.test5;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		List<String>li=Arrays.asList("Sahana","Gopinadh","Chikky","Akshitha","Indhu");
		li.stream().
		map(s->s.toUpperCase()).
		forEach(System.out::println);

	}

}
