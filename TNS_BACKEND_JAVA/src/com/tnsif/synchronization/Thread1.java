package com.tnsif.synchronization;

public class Thread1 extends Thread {
	ThreadDemo obj;
	Thread1 (ThreadDemo obj){
		this.obj=obj;
	}
	
public void run()  {
	for (int x=1;x<5;x++) {
		obj.Deliver(x);
		}
	}
}
