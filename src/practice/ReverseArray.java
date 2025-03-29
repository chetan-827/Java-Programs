package practice;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,34,13};
		
		int n=arr.length;
		System.out.println(n); 
		for (int i=0;i<n/2;i++) {
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
		
		//
		String str="hello";
		str=str.concat(" world");
		System.out.println(str);
		
		
		// reverse the elements of an array without using an additional array
	//	int[] arr= {1,2,3,4,5};
		
		System.out.println("Original array:");
		for(int num: arr) {
			System.out.println(num+" ");
		}
		
		reverseArray(arr);
		
		System.out.println("\nReversed array:");
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}
	
	public static void reverseArray(int[] arr) {
		int start=0;
		int end =arr.length-1;
		
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
	}
	
	
	

}
