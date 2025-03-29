package pack2;

import java.util.Scanner;

import pack1.Add;//implicit

public class Useaddmethod {
	
	public static void main(String[] args) {
//		Add a=new Add();
//		int c=a.add(5, 8);
//		System.out.println(c);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		findEvenOdd(num);
	}
	public static void findEvenOdd(int num) {
		if(num%2==0)
			System.out.println(num+" is even");
		else
			System.out.println(num+" is odd");
		
		Useaddmethod ad=new Useaddmethod();
		System.out.println("The sum is: "+ ad.add(12, 3));
	}
	int s;
	public int add(int a,int b) {
		s=a+b;
		return s;
	}
}
