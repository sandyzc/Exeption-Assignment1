package com.exeption.assignment1;

public class BankAtmExecption extends RuntimeException{
	
	String string;
	
	public BankAtmExecption(String string) {
		
		this.string = string;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return string;
	}

}
