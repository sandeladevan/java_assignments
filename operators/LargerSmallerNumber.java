package dev.java.operators;

import java.util.Scanner;

public class LargerSmallerNumber {


	    public static void main(String[] args) {
	    	Scanner s = new Scanner(System.in);
	    	System.out.println("enter a number");
	        int a = s.nextInt();
	        System.out.println("enter another number");
	        int b = s.nextInt();
	      
	   
	        if (a < b) {
	            System.out.println("Larger Number is " + b);
	        } 
	        else {
	            System.out.println("Smaller Number is " + b);
	        }
	        if (a > b) {
	            System.out.println("Larger Number is " + a);
	        } 
	        else {
	            System.out.println("Smaller Number is " + a);
	        }
	       s.close();
	    }
	}
