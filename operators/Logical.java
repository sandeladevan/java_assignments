package dev.java.operators;

public class Logical {

	public static void main(String[] args) {

		int a = 15;
		int b = 10;
		
		
	
		        
		System.out.println(a > b && a > b);
		System.out.println(a > b && a < b);
		System.out.println(a < b && a > b);
		System.out.println(a < b && a < b);

		System.out.println(a > b || a > b);
		System.out.println(a > b || a < b);
		System.out.println(a < b || a > b);
		System.out.println(a < b || a < b);

	 


		System.out.println(!(a > b));    
		System.out.println(!(a < b));     
	}


}


