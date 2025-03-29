package practice;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting day:");
		String str=sc.next();
		System.out.println("Enter number of days:");
		int n =sc.nextInt();
		String arr[] = {"mon","Tue","wed","thu","fri","sat","sun"};
		int i =0;
		for(i=0;i<arr.length; i++)
			if(arr[i].equals(str))
				break;
		int res =1;
		int rem=6-i;
		n=n-rem;
		if (n>0)
			res+=n/7;
		System.out.println("number of sundays within 13 days: "+res);
	}

}
