package practice;

public class SumDigits {

	public static void main(String[] args) {
//		int n=4555765;
//		int sum=0;
//		while(n!=0) {
//			sum=sum+n%10;
//			n=n/10;
//		}
		
		int number=455;
		int sum=0;
		
		while(number>0) {
			sum=sum+number%10;
			number=number/10;
		}
		System.out.println("Using while:"+sum);
	}

}
