package com.tnsif.multithread;

public class TestThread {

	public static void main(String[] args) throws InterruptedException{
		for(int i=0;i<5;i++) {
			MultiThreads mt=new MultiThreads();
			mt.start();
			Thread.sleep(5000);
			
		}
	}

		}


