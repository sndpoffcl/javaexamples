package com.cg.threaddemo.threadwork;

public class RunnableResource extends Thread {
	
//	public void run() {
//		Thread t = Thread.currentThread();
//		
//		if(t.getName().equals("tickThread")) {
//			
//		}
//			for(int i=1;i<10;i++)
//				System.out.println("Tick   " + i +" " + t.getName());
//		
//		if(t.getName().equals("tockThread"))
//			for(int i=1;i<=10;i++)
//				System.out.println("Tock  " + i + " " + t.getName());
//	
//		System.out.println("eND OF THREAD task");
//	}
	
	public void run() {
		Thread t = Thread.currentThread();
		
		if(t.getName().equals("evenThread"))
			for(int i=2;i<101;i+=2) {
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Even = " + i + " " + t.getName());
				
			}
				
		if(t.getName().equals("oddThread"))
			for(int i=1;i<101;i+=2)
				System.out.println("Odd = " + i + " " + t.getName());
		
		if(t.getName().equals("primeThread"))
			for(int i=1;i<101;++i) {
				boolean flag = false;
				for(int j=2;j<=i/2;++j) {
					if(i%j==0)
						flag=true;
				}
				if(flag==false)
					System.out.println("Prime = " + i + " " + t.getName());
			}
	}
}
