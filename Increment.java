package opretions;

public class Increment {
	public static void main(String[] args) {
		int i =90;
		//i = 90
		i++; 
		//90//91
		int j =i+9; //j=99
		
		//int j = i + 9;//91+9=100   j = 91 + 9 = 100
		
		System.out.println(i++);//91//92
		--j;//92//99
		System.out.println(j*i); //j = 99 i = 92

				//99 × 92 = 9108

		i++; // 92//93
		--i;  //92 
		System.out.println(--i); //91
		++i;//91//92
		System.out.println(j+3);//99+3=102

		j--;//98
		++j;//98//99
		System.out.println(j+7);//99+7=106
		j--;//98
		i++;//93
		--i;//92

		System.out.println(i+j);//92+98=190
		System.out.println(i);//92
		System.out.println(j);//98
	
		
	}

}

