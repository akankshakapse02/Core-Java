package com.loops;

public class Sum {
	public static void main(String[] args) {

		//for loop

		int sum = 0;
		// for (int i = 1; i <= 10; i++) {

		// sum += i;
		// }
		// System.out.println("Sum of first 10 natural numbers: " + sum);

		// while loop

		// int i=1;
		// while(i<=10) {

		// sum += i;
		// i++;
		// System.out.println("Sum of first 10 natural numbers: " + sum);
		// i++;
		// sum += i;
		
		//do while

		int i = 1;
		do {
			sum += i;
			i++;
			System.out.println("Sum of first 10 natural numbers: " + sum);

		} while (i <= 10);
	}

}
