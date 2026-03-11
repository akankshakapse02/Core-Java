package com.jbki;

public class Signals {
	public static void main(String[] args) {
		String clr = "Red";
		switch (clr) {
		case "Red": {
			System.out.println("Red----> Stop");
			break;
		}
		case "Green": {
			System.out.println("Green----> Go");
			break;
		}
		case "Yellow": {
			System.out.println("Yellow ---->ready to Go");
			break;
		}

		default: {
			System.out.println("invalid input");
		}

		}

	}

}
