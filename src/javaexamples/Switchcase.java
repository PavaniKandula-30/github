package javaexamples;
import java.util.Scanner;

public class Switchcase {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1 add");
		System.out.println("2 add");
		System.out.println("3 add");
		System.out.println("4 add");
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("enter ur choice");
		int ch=sc.nextInt();
		switch(ch){
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a*b);
				break;
		default:
					System.out.println("invalid choice2");
				
		}
	}

}
