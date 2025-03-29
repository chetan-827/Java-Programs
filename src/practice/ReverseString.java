package practice;

public class ReverseString {

	public static void main(String[] args) {

		String str="Hello";
		String reversed=new StringBuilder(str).reverse().toString();
		System.out.println("Reversed string:"+reversed);
		
		
		// using +(string concat) operator
		
		String name="chetan sai";
		String revname="";
//		int len=name.length();
		
//		for(int i=len-1; i>=0;i--) {
//			revname = revname + name.charAt(i);
//		}
//		System.out.println("Reversed name:"+revname);
			
			
		// 	using char array
		
		char a[]=name.toCharArray();
		
		int len=a.length;
		for(int i=len-1;i>=0;i--) {
			revname=revname+a[i];
		}
		System.out.println(revname);	
		
		//using method
		
		StringBuffer sb=new StringBuffer(name);
		System.out.println(sb.reverse());
			
		String str1="Cognizant";
		String reverse=new StringBuilder(str1).reverse().toString();
		System.out.println("Reversed String:"+reverse);
		

	
		//check the string is palindrome or not
//		if(str.equalsIgnoreCase(s2)) {
//			System.out.println("String is palindrome");
//		}else {
//			System.out.println("String is not palindrome");
//		}
		
		String reversed1=reverseString(str);
		System.out.println(reversed1);
		
		String testStr1="racecar";
		String testStr="hello";
		
		System.out.println(ispalindrome(testStr1));
		System.out.println(ispalindrome(testStr));
		
	}

	public static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	
	public static boolean ispalindrome(String str) {
		int left=0, right=str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
			return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
