package com.tka;
//parameter without retun type

public class palindromw {
	public void check(int num) {
        int rev = 0, orig = num;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if (orig == rev) {
            System.out.println(orig + " is Palindrome");
        } else {
            System.out.println(orig + " is not Palindrome");
        }
    }

}
