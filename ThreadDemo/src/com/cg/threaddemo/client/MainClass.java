package com.cg.threaddemo.client;
import com.cg.threaddemo.threadwork.*;


public class MainClass {
	public static void main(String[] args) throws InterruptedException {
		
		Thread th1 = new Thread(new Customer() , "rahul");
		Thread th2 = new Thread(new Customer() , "anil");
		Thread th3 = new Thread(new Customer() , "satish");
		th1.start();
		th1.setPriority(Thread.MAX_PRIORITY);
		th2.start();
		th3.start();
		
		
//		RunnableResource resource = new RunnableResource();
//		
//		Thread th1 = new Thread(resource , "tickThread");
//		Thread th2 = new Thread(resource , "tockThread");
//		th1.start();
//		th1.join();
//		th2.start();
		
//		System.out.println("main thread ends here");
//		Thread th1 = new Thread(resource , "evenThread");
//		Thread th2 = new Thread(resource , "oddThread");
//		Thread th3 = new Thread(resource , "primeThread");
//		th1.start();
//		th2.start();
//		th3.start();
	}
}
