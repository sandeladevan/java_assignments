package dev.java.operators;

import java.util.Scanner;

public class Arithmetic {


	public void addition(int a,int b) {
		int i = a + b;
		System.out.println("added"+" "+i);
	}

	public static void subtraction(int a,int b) {
		int i = a - b;
		System.out.println("subtracted"+" "+i);
	}

	public void multiplication(int a,int b) {
		int i = a * b;
		System.out.println("multiplied"+" "+i);
	}

	public static void division(int a,int b) {
		int i = a / b;
		System.out.println("divided"+" "+i);
	}

	public void modulus(int a,int b) {
		int i = a % b;
		System.out.println("remainder"+" "+i);
	}



	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");

		int a =s.nextInt();
		System.out.println("Enter another number");
		int b= s.nextInt();

		Arithmetic art = new Arithmetic();
		art.addition(a, b);
		subtraction(a,b);
		art.multiplication(a, b);
		division(a,b);
		art.modulus(a, b);
		s.close();
	}

}
