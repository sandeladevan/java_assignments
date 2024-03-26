package dev.java.operators;


import java.util.Scanner;

public class EqualNotEqual {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number : ");
		
		int a = s.nextInt();
		System.out.print("Enter second number : ");
		int b = s.nextInt();
		
		if (a == b) {
			System.out.println("numbers are equal");
		}
		
		else if (a != b) {
			System.out.println("numbers are different");
		}
		s.close();
	}


}


