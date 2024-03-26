package dev.java.operators;

public class IncrementDecrement {

    static void preIncrement() {
        int a = 20;
      int  result = ++a;
      System.out.println("preIncrement" + " "+result);//preIncrement
    }

    static void postIncrement() {
    	int a = 20;
        int  result = a++;
        System.out.println("postIncrement" + " "+result);//postIncrement
        System.out.println("after executing" +" "+a);//Increments the value of a variable after executing
    }

    static void preDecrement() {
    	int a = 20;
        int  result = --a;
        System.out.println("preDecrement" + " "+result);//preDecrement
    }

    static void postDecrement() {
    	int a = 20;
        int  result = a--;
        System.out.println("postDecrement" + " "+result);//postDecrement
        System.out.println("after executing" +" "+a);//Decrements the value of a variable after executing
    }

    public static void main(String[] args) {
        
        preIncrement();
        postIncrement();
        preDecrement();
        postDecrement();
    }
}
