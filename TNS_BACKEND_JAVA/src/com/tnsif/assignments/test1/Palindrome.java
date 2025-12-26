package com.tnsif.assignments.test1;

public class Palindrome {

	public static void main(String[] args) {
    int num=121;
    int original=num;
    int reverse=0;
    while(num>0) {
    	int digit=num%10;
    
    reverse=reverse*10+digit;
    num=num/10;
      }
    	if(121==reverse){
    		System.out.println(121+"is a Palindrome");
    	}else {
    	
    		System.out.println(121+"is not a Palindrome");
    		
    	}
    
	}}


