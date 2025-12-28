package com.tnsif.assignments.test1;

public class ArmStrong {

	public static void main(String[] args) {
		int num=370;
		int original=370;
		int sum=0;
		while (num >0) {
			int digit=num%10;
			sum=sum+(digit*digit*digit*digit);
			num=num/10;
		}
			if(sum ==1634) {
				System.out.println(1634 +"is an ArmStrong number");
		}
			else
			{
				System.out.println(1634 +"is  not an ArmStrong number");
			}
	}

}
