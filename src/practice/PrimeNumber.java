package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=32;
		int count=0;
		if(num<=1) {
			System.out.println("This number is not prime ");
			return;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				count++;
			}
			if(count>1) {
				System.out.println("The num is not prime");
			}else {
				System.out.println("number is prime");
			}
		}
	}

}
