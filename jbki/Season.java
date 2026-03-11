package com.jbki;

public class Season {
	public static void main(String[] args) {
		
		int num = 4;
		switch(num) {
		case 12,1:{
			System.out.println("Winter");
		 break;
		}
		case 3,4,5:{
			System.out.println("Summer");
		 break;
		}
		case 6,7,8:
		{
			System.out.println("Monsoon");
		 break;
		}
		
		default:{
			System.out.println("invalid input");
	}
}
		
	}

}
