package flowcontrol;

public class Agegroup {
	public static void main(String[] args) {
		int age=18;
		if(age<=15) {
			System.out.println("person id child");
		}
		else if (age<=21) {
			System.out.println("person is adult");
			
		}
		else if (age<=65) {
			System.out.println("person is old");
		}
	}

}
