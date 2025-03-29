package practice;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		while(sum<=100) {
			System.out.println("enter a number:");
			sum+= sc.nextInt();
		}
		System.out.println("Done"+sum);
		
		int s=0;
		do {
			System.out.println("enter the number:");
			s+=sc.nextInt();
		}while(s<=100);
		System.out.println("Done"+s);
		}
	

}
