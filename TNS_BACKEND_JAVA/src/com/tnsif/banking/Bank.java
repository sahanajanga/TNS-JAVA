package com.tnsif.banking;

public interface Bank {
	int MIN_BALANCE=100;
	int DEPOSITE_LIMIT=25000;
	void deposite(Account account,double amount);
	void withdrawal(Account account,double amount);
	

}
