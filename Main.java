package com.exeption.assignment1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws BankAtmExecption {
		
		Scanner scr = new Scanner(System.in);
		
	BankAtm atm = new BankAtm(2, "Acadgild", "BNglr", 10000);
	System.out.println("Atm id :"+atm.atmId);
	System.out.println("Bank name :"+atm.bankName);
	System.out.println("Branch : "+atm.location);
	System.out.println("Available balance is :"+atm.balance);
	System.out.println("Enter the amount to be deposited");
	int dep = scr.nextInt();
	atm.deposit(dep);
	System.out.println("Available balace after depositing "+dep+" is :"+atm.balance);
	System.out.println("Enter the money to be withdrawn");
	double wd = scr.nextDouble();
	atm.withdraw(wd);
	System.out.println("Available balance is :"+atm.balance);
	
	System.out.println("______________________________________");
	
	
	BankAtm atm2 = new BankAtm(3, "BAnk2", "xyz", 10000);
	System.out.println("Atm id "+atm2.atmId);
	System.out.println("Bank name :"+atm2.bankName);
	System.out.println("Branch name :"+atm2.location);
	System.out. println("Available balance is :"+atm2.balance);
	System.out.println("Enter the amount to be deposited");
	int dep2 = scr.nextInt();
	atm2.deposit(dep2);
	System.out.println("Available balace after depositing "+dep+" is :"+atm2.balance);
	System.out.println("Enter the money to be withdrawn");
	double wd2 = scr.nextDouble();
	atm2.withdraw(wd2);
	System.out.println("Available balance is :"+atm2.balance);
	
	System.out.println("______________________________________");
	
	BankAtm atm3 = new BankAtm(4, "BAnk3", "axix", 10000);
	System.out.println("Atm id "+atm3.atmId);
	System.out.println("Bank name :"+atm3.bankName);
	System.out.println("Branch name :"+atm3.location);
	System.out. println("Available balance is :"+atm3.balance);
	System.out.println("Enter the amount to be deposited");
	int dep3 = scr.nextInt();
	atm2.deposit(dep3);
	System.out.println("Available balace after depositing "+dep+" is :"+atm3.balance);
	System.out.println("Enter the money to be withdrawn");
	double wd3 = scr.nextDouble();
	atm3.withdraw(wd3);
	System.out.println("Available balance is :"+atm3.balance);
	}

}
