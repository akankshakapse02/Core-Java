package com.PractiseSession;

public class SeasonMonth {
	public static void main(String[] args) {
		String month= "March";
		switch(month) {
		case "Des","jan","feb":
			System.out.println("Winter");
		break;
		case "March","April","May" :
			System.out.println("Summary");
		break;
		case "jun","jully","August":
			System.out.println(" Monsoon");
		break;
		case "sep","oct","nov":
			System.out.println("Autumn");
		break;
			default:
				System.out.println("invalid input");
		}
	}

}
