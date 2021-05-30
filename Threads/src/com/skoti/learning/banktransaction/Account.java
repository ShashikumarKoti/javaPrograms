package com.skoti.learning.banktransaction;

/*
 * This class represents an account in the bank
 */
public class Account {

	private int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		this.balance = this.balance + amount;
	}
	
	public void withdraw(int amount) {
		this.balance = this.balance - amount;
	}
	
	public int getBalance() {
		return this.balance;
	}
}
