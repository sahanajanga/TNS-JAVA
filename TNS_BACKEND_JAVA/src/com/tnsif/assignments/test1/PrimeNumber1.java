package com.tnsif.assignments.test1;

public class PrimeNumber1 {

	public static void main(String[] args) {
		int num=49;
		
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
if(count==2) {
	System.out.println(num+"is a PrimeNumber");
}
else
{
	System.out.println(num+"is  not a PrimeNumber");
	
}
	}

}
