package com.loops;

public class oddnosum {
	public static void main(String[] args) {
		//for loop
		
		int sum = 0;
		// for (int i = 1; i <= 100; i+=2) {

		// sum += i;
		// }
		// System.out.println("Sum of first 10 natural numbers: " + sum);

		// while loop
		int i = 1;
		 while (i <= 100) {
		 sum += i;
		 i += 2;

		 System.out.println("Sum of even numbers from 1 to 100: " + sum);
		 }

		// do while loop

		//int i = 1;
		//do {

//			sum += i;
		//	i += 2;
			//System.out.println("Sum of even numbers from 1 to 100: " + sum);
		//} while (i <= 100);

	}

}
