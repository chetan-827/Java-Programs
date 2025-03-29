package classes;

import java.util.Scanner;

public class MinMax {
	void min(int a, int b) {
		a=50;
		if (a > b) {
			System.out.println(a + " is max num");
		} else {
			System.out.println(b + " is max num");
		}
	}

	public static void main(String[] args) {
		MinMax m1 = new MinMax();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter two numbers");
//		int c = sc.nextInt();
//		int d = sc.nextInt();
		int c=20,d=30;
		m1.min(c,d);//arguments actual parameters
		System.out.println(c);
	}

}
