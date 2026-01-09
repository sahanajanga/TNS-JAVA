package com.tnsif.synchronization;

public class ThreadDemo {
	int i;
	boolean flag=false;
	synchronized void Deliver(int i) {
		if(flag)
			try {
				wait();
			}
		catch (Exception e)   {
			System.err.println(e);
			}
		this.i=i;
		flag=true;
		System.out.println("The msg is Deliverd " +i);
		notify();
		}

synchronized int Receiver() {
	if(!flag)
		try {
			wait();
		}
	catch(Exception e) {
		System.err.println(e);
	}
	System.out.println("The msg is received" +i);
	flag=false;
	notify();
	return i;
}
}