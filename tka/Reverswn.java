package com.tka;
//non parameter with oute retun type
public class Reverswn {
	public void reverse() {
		int num=10;
		int rev = 0, orig = num;
        while (orig != 0) {
            rev = rev * 10 + orig % 10;
            orig /= 10;
        }
        System.out.println("Reversed number: " + rev);
    }
		
	}
	


