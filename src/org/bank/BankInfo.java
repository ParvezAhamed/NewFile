package org.bank;

public abstract class BankInfo {
	
	public void saving() {
		System.out.println("Saving is 10%");

	}
	public void fixed() {
		System.out.println("FD is 15%");
		
	}
	//abstract method
	public abstract void deposit();
}
