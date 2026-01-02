package com.tnsif.Array;

public class MultipleArray {

	public static void main(String[] args) {
		int[][] marks= {{23,29},{18,20}};
		for( int i=0;i<marks.length;i++) //rows
		{
			for(int j=0;j<marks[i].length;j++) //columns
			{
				marks[i][j]=(int)(Math.random()*100);
				System.out.println(marks[i][j]+ "");
			}
			System.out.println();
		}
	}
}
 