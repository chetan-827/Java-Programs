package practice;

import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("enter the elements in an array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=1; i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println("The maximum value is:"+max);
		System.out.println("The minimum value is:"+min);
	}

}
