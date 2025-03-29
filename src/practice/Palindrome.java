package practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter a number:");
		
//		int num=sc.nextInt();
//		
//		int org_num=num;
//		
//		int rev=0;
//		
//		while(num!=0) {
//			rev=rev*10+num%10;
//			num=num/10;
//		}
//		if(org_num==rev) {
//			System.out.println(org_num+"Palindrome num");
//		}else {
//			System.out.println(org_num+"Not palindrome num");
//		}
		
		System.out.println("Enter a String");
		String str=sc.next();
		String org_str=str;
		
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed String:"+rev);
		
		if(org_str.equals(rev)) {
			System.out.println(org_str+" is palindrome string");
		}else {
			System.out.println(org_str+" is not a palindrome string");
		}
	}

}
