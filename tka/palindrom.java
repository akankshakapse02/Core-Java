package com.tka;
//non paramert with retun type
public class palindrom {
	
	    int num = 121;
	    public boolean check() {
	        int rev = 0, orig = num;
	        while (num != 0) {
	            rev = rev * 10 + num % 10;
	            num /= 10;
	        }
	        return orig == rev;
	    }

	    

	}
	
