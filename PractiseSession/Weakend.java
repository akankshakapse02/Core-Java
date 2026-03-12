package com.PractiseSession;

public class Weakend {
	public static void main(String[] args) {
		int num = 6;
		switch (num) {
		case 1, 2, 3, 4:
			System.out.println("Weeakday");
			break;
		case 5, 6, 7:
			System.out.println("weakend");
			break;
		default:
			System.out.println("invalid input");
		}
	}

}
