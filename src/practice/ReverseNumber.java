package practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		// 1. Using the algorithm
		
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10; //0*10+32%10=2  20+3=23 
			num=num/10; //32/10=3  3/10=0
		}
		System.out.println(rev);
		
		// using stringbuffer class
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		System.out.println(sb.reverse());
		
		
		// Using StringBuilder class
		
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev1=sbl.reverse();
		System.out.println("Reversed number:"+rev1);
		
		
	}

}
