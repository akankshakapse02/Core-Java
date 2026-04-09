package day1;

public class palindorm {
	public static void main(String[] args) {
		
		        int num = 111; // input number
		        int originalNum = num;
		        int reverse = 0;

		        // reverse the number
		        while (num != 0) {
		            int lastDigit = num % 10;
		            reverse = reverse * 10 + lastDigit;
		            num /= 10;
		        }

		        // check if original number is equal to reversed number
		        if (originalNum == reverse) {
		            System.out.println(originalNum + " is a palindrome number.");
		        } else {
		            System.out.println(originalNum + " is not a palindrome number.");
		        }
		    }
		}