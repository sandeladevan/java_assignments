package dev.java.operators;

import java.util.Scanner;

public class Relational {
	
	    public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);
	    	System.out.println("enter (a) number");
	        int a = s.nextInt();
	        System.out.println("enter (b) number");
	        int b = s.nextInt();
	        System.out.println(a < b);  //less than 
	        System.out.println(a > b);  //greater than
	        System.out.println(a <= b); //less than or equals
	        System.out.println(a >= b); //greater than or equals
	        s.close();
	    }
}
