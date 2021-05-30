package com.skoti.learning.banktransaction;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Case-1: Using Lock object(explicit locking)
//public class Bank {
//	
//	public static final int MAX_ACCOUNT = 10;
//	public static final int MAX_AMOUNT = 10;
//	public static final int INITIAL_BALANCE = 100;
//	
//	Account[] accounts = new Account[MAX_ACCOUNT];
//	
//	private Lock bankLock = new ReentrantLock();
//	
//	public Bank() {
//		for(int i=0;i<MAX_ACCOUNT;i++) {
//			accounts[i] = new Account(INITIAL_BALANCE);
//		}
//	}
//	
//	public void transferAmount(int fromAccount, int toAccount, int amount) {
//		bankLock.lock();
//		try {
//		 if (amount <= accounts[fromAccount].getBalance()) {
//	            accounts[fromAccount].withdraw(amount);
//	            accounts[toAccount].deposit(amount);
//	 
//	            String message = "%s transfered %d from %s to %s. Total balance: %d\n";
//	            String threadName = Thread.currentThread().getName();
//	            System.out.printf(message, threadName, amount, fromAccount, toAccount, getTotalBalance());
//	        }
//		}finally {
//		 bankLock.unlock();
//		}
//	}
//	
//	public int getTotalBalance() {
//		bankLock.lock();
//		try {
//        int total = 0;
// 
//        for (int i = 0; i < accounts.length; i++) {
//            total += accounts[i].getBalance();
//        }
//        return total;
//		}finally {
//			bankLock.unlock();
//		}
//        
//    }
//}


//Case-2: Using synchronized(Implicit locking)
public class Bank {
	
	public static final int MAX_ACCOUNT = 10;
	public static final int MAX_AMOUNT = 10;
	public static final int INITIAL_BALANCE = 100;
	
	Account[] accounts = new Account[MAX_ACCOUNT];
	
	
	public Bank() {
		for(int i=0;i<MAX_ACCOUNT;i++) {
			accounts[i] = new Account(INITIAL_BALANCE);
		}
	}
	
	public synchronized void transferAmount(int fromAccount, int toAccount, int amount) {
		 if (amount <= accounts[fromAccount].getBalance()) {
	            accounts[fromAccount].withdraw(amount);
	            accounts[toAccount].deposit(amount);
	 
	            String message = "%s transfered %d from %s to %s. Total balance: %d\n";
	            String threadName = Thread.currentThread().getName();
	            System.out.printf(message, threadName, amount, fromAccount, toAccount, getTotalBalance());
	        }
	}
	
	public synchronized int getTotalBalance() {
        int total = 0;
 
        for (int i = 0; i < accounts.length; i++) {
            total += accounts[i].getBalance();
        }
        return total;
    }
}

