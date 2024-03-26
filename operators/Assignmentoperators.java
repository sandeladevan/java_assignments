package dev.java.operators;

import java.util.Scanner;

public class Assignmentoperators {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter a number");
    int a = s.nextInt();
    System.out.println("entered number"+" "+ a );
    
    //AssignmentOperators
    int i =a;
    i +=5;
    System.out.println(i);
    i -=5;
    System.out.println(i);
    i *=5;
    System.out.println(i);
    i /=5;
    System.out.println(i);
    i %=5;
    System.out.println(i);
    s.close();
    
}
}
