package practice;

import java.util.Scanner;

public class EvenOddCount {
	public static void countEvenOdd(int[] arr) {
		
		int evenCount = 0;
		int oddCount = 0;

		for (int num : arr) {
			if (num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		System.out.println(evenCount);
		System.out.println(oddCount);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 45, 6, 7, 524, 246, 211, 124, 21, 24, 14 };
		
		countEvenOdd(arr);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		if(num%2==0)
			System.out.println("Given number is even number");
		else
			System.out.println("given number is odd number");
		
		int number= 12345;
		
		int even_count=0;
		int odd_count=0;
		
		while(number>0) {	//12345  1234  123  12 1
			int rem=number%10;	// 5  4  3 2 1
			
			if(rem%2==0) {
				even_count++; // 1 2
			}else {
				odd_count++;	// 1 2 3
			}
			
			number=number/10; 	// 1234 123 12 1 0
		}
		
		System.out.println("Number of even numbers:"+even_count);
		System.out.println("Number od odd numbers:"+odd_count);
	}

}
