package com.tnsif.banking;

public class Account {
	private int accountNo;
	private String name;
	private double balance;
	private Bank bank;
	public Account(int accountNo, String name, double balance, Bank bank) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		this.bank = bank;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" + balance + ", bank=" + bank + "]";
	}


public void deposite(double amount) {
	bank.deposite(this,amount);
}
public void withdrawal(double amount) {
	bank.withdrawal(this, amount);
}
}