package com.tka;
//non parameter without return type

public class Palindromno {
	int num;
	public void checkno() {
		int num=10;
		int reve=0;
		int org=num;
		while(num!=0) {
			reve=reve*10+num%10;
			num/=10;
			  }
		        if (org == reve) {
		            System.out.println(org + " is Palindrome");
		        } else {
		            System.out.println(org + " is not Palindrome");
		        }
		    
			}
			
			
		}
		
	


