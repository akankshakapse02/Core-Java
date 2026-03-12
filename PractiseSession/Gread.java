package com.PractiseSession;

public class Gread {
	public static void main(String[] args) {
		int gread = 3;
		switch (gread) {
		case 1:
			System.out.println("grade A --->90-80----- Distinction>");
			break;

		case 2:
			System.out.println("grade B--->80-85-----First class ");
			break;

		case 3:

			System.out.println("grade c--->85-70-----> second class");
			break;

		case 4:

			System.out.println("grade D--->70-75-----> pass");

			break;
		case 5:

			System.out.println("grade D--->75-60-----> Need to improvemnt");
			break;

		default:
			System.out.println("fail");

		}
	}

}
