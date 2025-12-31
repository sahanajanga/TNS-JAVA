package com.tnsif.banking;

public class BankImp implements Bank {
	public void deposite(Account account,double amount) {
		if(amount>DEPOSITE_LIMIT) {
			System.out.println("The deposite is not possible");
		}
		else {
			account.setBalance(account.getBalance()+amount);
		System.out.println("The deposite is possible");
		}
	}
public void withdrawal(Account account,double amount) {
	if(account.getBalance()>amount) {
		account.setBalance(account.getBalance()-amount);
		System.out.println("The transaction is successfull");
		}
	else {
		System.out.println("The insufficient fund");
	}
}
}
