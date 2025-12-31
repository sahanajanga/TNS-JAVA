package com.tnsif.banking;

public class BankApplication {

	public static void main(String[] args) {
		Bank bank=new BankImp();
		Account account=new Account(1234,"sahana",5000,bank);
		bank.deposite(account,5000);
		bank.withdrawal(account, 3000);
		System.out.println(account);
		}

	}


