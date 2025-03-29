package practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = s.nextInt();

		int sum = 1;
		boolean isprime=true;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				sum += i;
				break;
			}

		}
		System.out.println(sum == 1 ? "prime" : "notprime");

	}

}
