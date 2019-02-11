package com.cg.threaddemo.threadwork;

import com.cg.threaddemo.beans.Account;

public class Customer implements Runnable {
	
	public Customer() {}
	
	private static Account account;
	
	static {
		account = new Account(10000);
		System.out.println("Intial balance :=" + account.getBalance() + "\n\n==============");
	}

	@Override
	public void run() {
		Thread customerThread = Thread.currentThread();
		if(customerThread.getName().equals("rahul")) {
			for(int i=0;i<=10;i++) {
				try {
					System.out.println("\nrahul has call withdraaw() "  + i + " time balance := " + account.withdraw(3000));
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		else if(customerThread.getName().equals("anil")){
			for(int i=1;i<=10;i++) {
				try {
					System.out.println("\nAnil has call deposit() "+i+ " time balance :- " + account.deposit(2000));
					Thread.sleep(3000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}else if(customerThread.getName().equals("satish")) {
			for(int i=1;i<=3;i++) {
				System.out.println("\n Satish has call checkBalance() " + i + " time balance = " + account.checkBalance());
			}
		}
		
	}
	

}
