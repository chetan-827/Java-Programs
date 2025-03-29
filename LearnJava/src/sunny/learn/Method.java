package sunny.learn;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int y = 4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
	//	int z = x+y;
	//	System.out.println(z);
	//	div(16,2);
		int num3=16;
		int num4=2;
		System.out.println(div(num3,num4));
		hello();
		String name="Bro";
		hello(name);
		name();
		
		add(a,b);
		System.out.println(add(x,y));
		multiplenumbers(18,1,9);
	}
	static int add(int x,int y) {
	//	System.out.println((x+y));
		return x+y;
	
	}
	public static void hello(String name) {
		System.out.println("Hello "+"cat "+name);
	}
	static void hello() {
		System.out.println("hello my name is chetan");
	}
	static void name() {
		System.out.println("how are you");
	}
	public static void multiplenumbers(int num1,int num2,int num3) {
		System.out.println(num1*num2*num3);
	}
	static int div(int num3,int num4) {
	//	System.out.println(num3/num4);
		return num3/num4;
	}
}
