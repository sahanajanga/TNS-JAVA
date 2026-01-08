package com.tnsif.multithread;

public class RunDemo {

	public static void main(String[] args) {
		RunThread rd=new RunThread();
		Thread tt=new Thread(rd);
		tt.start();

	}

}
