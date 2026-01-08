package com.tnsif.multithread;

public class MultiThreads extends Thread {
public void run() {
	try {
	System.out.println("This is current thread running:" +Thread.currentThread().getId());
	Thread.sleep(5000);
}
catch (Exception e)
{
	System.out.println("Exception caught");
}
}
}

