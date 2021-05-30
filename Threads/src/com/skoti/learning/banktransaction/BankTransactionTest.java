package com.skoti.learning.banktransaction;

public class BankTransactionTest {

	public static void main(String[] args) {
		Bank bank = new Bank();
		for(int fromAccount=0; fromAccount<Bank.MAX_ACCOUNT; fromAccount++) {
			Thread thread = new Thread(new BankTransaction(bank, fromAccount));
			thread.start();
		}
	}

}
