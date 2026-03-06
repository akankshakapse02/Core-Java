package flowcontrol;

public class Grade {
	public static void main(String[] args) {
		double percentage = 67.5;
		if (percentage <= 60) {
			System.out.println("D");
		} else if (percentage <= 75) {
			System.out.println("C");

		} else if (percentage <= 80) {
			System.out.println("B");

		}else if ( percentage <= 95) {
			System.out.println("A");
		}
		else {
			System.out.println("fail");
			
		}
 
	}
}