package com.tnsif.lambdaexpression;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,Integer>hm=new HashMap <String,Integer>();
hm.put("Java",98);
hm.put("Python",97);
hm.put("C",78);
hm.put("C++",88);
hm.forEach ((key,value)->System.out.println("key is:"+key+ " value is:" +value));
	}

}
