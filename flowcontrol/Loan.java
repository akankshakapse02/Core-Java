package flowcontrol;

public class Loan {
	public static void main(String[] args) {
		int age = 20;
		int income = 50000;
		if(age >= 21 && income >=4500) {
			System.out.println(" you are eligibel for loan");
		}else {
			System.out.println(" you are Not eligibel for loan");
		}
	}

}
