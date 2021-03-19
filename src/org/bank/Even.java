package org.bank;

public class Even {
	
	public static void main(String[] args) {
		
		int a = 0;
		for (int i = 1; i <= 10; i++) {
			
			if (i%2 == 0) {
				
				System.out.println(i);
				a++;
				
			}
			
			else {
				
				System.out.println("Odd Num");
			}
			
		}
		System.out.println("Even Num" + a );
	}

}
