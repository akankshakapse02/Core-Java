package com.tka;
//parameter with retun
public class Fact {
	 public int factorial(int num) {
	        int fact = 1;
	        for (int i = 1; i <= num; i++) {
	            fact *= i;
	        }
	        return fact;
	    }

	 
	 
	//parameter with retun
	 public class Factmain {
	 	 public static void main(String[] args) {
	 	        Fact f = new Fact();
	 	        System.out.println("Factorial of 5: " + f.factorial(5));
	 	    }

	 }

}


/*//parameter without retun
public class fact1 {
	public void factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + ": " + fact);
    }
	

}




//parameter without retun
public class fact1main {
	public static void main(String[] args) {
		fact1 f=new fact1(); {
			fact1 fs = new fact1();
	        fs.factorial(5);
		}
	}

}*/





//non parameter without retun
/*public class fact1 {
	 public void factorial() {
	        int num = 5;
	        int fact = 1;
	        for (int i = 1; i <= num; i++) {
	            fact *= i;
	        }
	        System.out.println("Factorial of " + num + ": " + fact);
	    }

	}
	
	
	
	
	
	//non parameter without retun
public class fact1main {
	public static void main(String[] args) {
		
	        fact1 f = new fact1();
	        f.factorial();
	    }
	

	}*/







//non parameter with retun
/*public class fact1 {
	 public int factorial() {
	        int num = 5;
	        int fact = 1;
	        for (int i = 1; i <= num; i++) {
	            fact *= i;
	        }
	        return fact;
	    }

	}
	
	
	
	
	
	
	//non parameter without retun
public class fact1main {
	 public static void main(String[] args) {
	        fact1 f = new fact1();
	        System.out.println("Factorial: " + f.factorial());
	    }
	}*/
	