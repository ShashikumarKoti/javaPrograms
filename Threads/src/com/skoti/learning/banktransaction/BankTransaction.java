package com.skoti.learning.banktransaction;

/**
 * This class represents a transaction task that can be executed by a thread.
 */
public class BankTransaction implements Runnable {

	private Bank bank;
	private int fromAccount;
	
	public  BankTransaction(Bank bank, int fromAccount) {
		this.bank = bank;
		this.fromAccount = fromAccount;
	}
	
	@Override
	public void run() {
		for(int i=1;i<50;i++) {  //Doing 50 transactions
            int toAccount = (int) (Math.random() * Bank.MAX_ACCOUNT);
 
            if (toAccount == fromAccount) 
            	continue;
 
            int amount = (int) (Math.random() * Bank.MAX_AMOUNT);
 
            if (amount == 0) 
            	continue;
 
            bank.transferAmount(fromAccount, toAccount, amount);
 
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
}
