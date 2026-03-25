package com.tka;
//parameter with retun type
public class Palindorm {
	 public boolean isPalindrome(int num) {
	        int rev = 0, orig = num;
	        while (num != 0) {
	            rev = rev * 10 + num % 10;
	            num /= 10;
	        }
	        return orig == rev;
	    }
}
