package com.tnsif.multithread;

public class RunThread  implements Runnable {
	public void run() {
        System.out.println("Thread is running using Runnable interface");
        System.out.println("Current Thread Name: " + Thread.currentThread().getName());
    }
}
