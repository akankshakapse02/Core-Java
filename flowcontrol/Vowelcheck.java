package flowcontrol;

public class Vowelcheck {
	public static void main(String[] args) {
		char character = 'A';  
		if(character == 'a' || character == 'e' || character == 'o' || character == 'u' || character == 'w')
		{
			System.out.println("char is vowel");
		}
		else if(character  >= 'a' && character  <= 'z')
		{
			System.out.println("char is consonant");
		}
		else
		{
			System.out.println("invalid character");
		}
		
	}

}
