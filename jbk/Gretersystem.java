package com.jbk;

public class Gretersystem {
	public static void main(String[] args) {
		int marks = 67;
		if (marks >= 75 && marks >= 100) {
			System.out.println("Distinction");
		} else if (marks >= 60 && marks <75) {
			System.out.println("first class");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("second class");
		} else if (marks >= 35 && marks < 50) {
			System.out.println("pass");
		} else {
			System.out.println("fail ");
		}

	}

}
