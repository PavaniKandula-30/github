package javaexamples;

public class Staticmethod {
	int b=40;
	static int empid=101;
	public void m1()
	{ int a=10;
		System.out.println("m1 executed");
		System.out.println(a +"local variable");
		System.out.println(empid +"static variable");
	
	}
	public void m2()
	{
		System.out.println("m2 executed");
		System.out.println(b +"instance var");
		System.out.println(empid +"static var");
		
	}
public void m3()
{
	System.out.println("m3 executed");
	System.out.println(b +"instance");
	}
public static void st()
{
	System.out.println("static method executed");
}
public static void main(String args[])
{
	System.out.println("main method executed");
	Staticmethod n=new Staticmethod();
	n.m1();
	n.m2();
	n.m3();
	Staticmethod.st();
	
	
	
}
}
