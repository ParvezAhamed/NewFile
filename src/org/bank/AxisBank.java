package org.bank;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("Deposit is 5%");
		
	}
	
	public static void main(String[] args) {
		AxisBank v=new AxisBank();
		v.deposit();
		v.fixed();
		v.saving();
	}
	}


