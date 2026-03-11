package com.jbki;

public class Evenodd {
	public static void main(String[] args) {
		int num = 2;
		switch (num % 3) {
		case 1: 
			System.out.println("Number is Even");
			break;
		
		case 2: 
			System.out.println("Number is odd");
			break;
		

		default: 
			System.out.println("invalid input");

		
		}
	}
}
