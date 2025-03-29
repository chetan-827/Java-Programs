package practice;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100,b=200;
		System.out.println("After swapping,a="+a+"and b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping,a="+a+"and b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping,a="+a+"and b="+b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping,a="+a+"and b="+b);
		
	}

}
