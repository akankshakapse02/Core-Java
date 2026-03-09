package com.jbk;

public class Vowel {
	
		public static void main(String[] args) {
			
			 char ch = '8';

		        if (ch >= '0' && ch <= '9') {
		            System.out.println(ch + " is a digit");
		        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		            System.out.println(ch + " is a vowel");
		        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
		            System.out.println(ch + " is a consonant");
		        } else {
		            System.out.println(ch + " is a special character");
		        }
		    }
		
			
			
		}





