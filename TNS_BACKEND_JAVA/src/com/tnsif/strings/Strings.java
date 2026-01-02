package com.tnsif.strings;

public class Strings {

	public static void main(String[] args) {
		String s=new String("RadhaKrishna");
		String s1=new String("krishnaRadha");
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.length());
		System.out.println(s.charAt(8));
		System.out.println(s.indexOf('i'));
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		
		

	}

}
