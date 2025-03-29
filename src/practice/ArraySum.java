package practice;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<n;i++) {
			sum+=arr[i];
		}
		
		System.out.println("sum of array element is:"+sum);
	
		int[] numbers= {12,2,43,121,235,65};
		
		int sum1=0;
		
		for(int num:numbers) {
			sum1+=num;
		}

		System.out.println("Sum: "+sum1);
	}

}
