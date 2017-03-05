package com.exeption.assignment1;

public class BankAtm {
	int atmId;
	String bankName;
	String location;
	double balance;

	public BankAtm(int atmId, String bankName, String location, int balance) {
		super();
		this.atmId = atmId;
		this.bankName = bankName;
		this.location = location;
		this.balance = balance;
	}
// withdraw
	public double withdraw(double amt) throws BankAtmExecption {
			
		if (balance > amt){
			
			balance = balance-amt;
		//check weather u have enough balance	
		}if(amt>10000){
			throw new BankAtmExecption("You do not have enough balance");
			//check if within the limit
		}if(balance<amt){
			throw new BankAtmExecption("You cannot withdraw more than 10000");
			
		}
		return balance;
	}
		
	

	public double deposit(double amt) {
		balance = balance + amt;
		return balance;
	}

}
