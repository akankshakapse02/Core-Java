package com.jbki;

public class Vowel {
	public static void main(String[] args) {
		char ch = 'A';
		switch (ch) {
		case 'a', 'e', 'i', 'o', 'u':

			System.out.println("char is vowel");
			break;

		default:
			System.out.println("char is consonant");

		}
	}

}
