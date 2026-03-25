package com.tka;
//non paramert with retun type
public class Reversnon {
	 int num = 123;
	    public int reverse() {
	        int rev = 0, orig = num;
	        while (orig != 0) {
	            rev = rev * 10 + orig % 10;
	            orig /= 10;
	        }
	        return rev;
	    }
	 
}

