package com.jbk;

public class Leap {
	public static void main(String[] args) {
		int years = 2024;
		if (years % 4 == 0) {

			if (years % 100 == 0) {

				if (years % 400 == 0) {
					System.out.println("years is leap");
				} else {
					System.out.println("years is not a leap");
				}
			} else {
				System.out.println("years is leep");
			}
		} else {
			System.out.println("years is not leep");
		}
	}

}
