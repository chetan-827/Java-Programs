package practice;

public class Swapping2Numbers {

	public static void main(String[] args) {
		
		int a=10; int b=20;
		
		System.out.println("Before swapping values are:"+a+" "+b);
		
		//logic1-third variable
		
//		int t=a;
//		a=b;
//		b=t;
		
		//logic2 use + & -without using third variable
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
	
		// logic3 use * and / without using third variable
		// here a and b values should not be zero
		
//		a=a*b;
//		b=a/b;
//		a=a/b;
		
		//logic4 -bitwise xor(^)
		
//		a=a^b;
//		b=a^b;
//		a=a^b;
		
		//logic5-single line statement
		
		b=a+b-(a=b);
		
		System.out.println("After swapping "+a+" "+b);
		 
		
	}

}
