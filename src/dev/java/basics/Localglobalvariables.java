package dev.java.basics;

//inside class ,outside method ---global variable
//inside method ---local variable

public class Localglobalvariables {

	int a= 1;//instance variable
	
	static int i = 2; //class variable
	
	void Meth() {
		int a =3;//local variable
		System.out.println(a);
	}
	
	public static void math(int j) {
		//parameter variable
		System.out.println(j);
	}
	public static void main(String[] args) {
		
		Localglobalvariables m = new Localglobalvariables();
		
		System.out.println(m.a);
		System.out.println(i);
		m.Meth();
		math(4);
	
	}

}
