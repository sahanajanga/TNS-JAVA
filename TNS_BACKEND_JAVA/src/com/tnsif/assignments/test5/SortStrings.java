package com.tnsif.assignments.test5;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;
public class SortStrings {

	public static void main(String[] args) {
		List<String>li=Arrays.asList("Sahana","Gopinadh","Chikky","Akshitha","Indhu");
Collections.sort(li,(s1,s2)-> s1.compareTo(s2));
System.out.println(li);

	}

}
