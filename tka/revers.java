package com.tka;
//parameter without retun type
public class revers {
	public void checkno(int num) {
		
		int rev=0;
		
		while(num!=0) {
			rev = rev * 10 + num % 10;
            num /= 10;
			
		}
		 System.out.println("Reversed number " + rev);
	}

}
