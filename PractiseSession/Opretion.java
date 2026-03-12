package com.PractiseSession;

public class Opretion {
	public static void main(String[] args) {
		char ch = '%';
		int num = 10;
		int num1 = 20;
		switch (ch) {
		case '+':
			System.out.println("Addtion is = " + (num + num1));
			break;
		case '-':
			System.out.println("Substrction is = " + (num - num1));
			break;
		case '*':
			System.out.println("multiplaction is = " + (num * num1));
			break;
		case '/':
			System.out.println("division is = " + (num / num1));
			break;
		case '%':
			System.out.println("mouduls = " + (num % num1));
			break;
		default:
			System.out.println("invalid input");

		}
	}

}
