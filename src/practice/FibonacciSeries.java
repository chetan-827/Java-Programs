package practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0, num2=1, num=10;
//		for(int i=0;i<=num;i++) {
//			System.out.println(num1+"");
//			int num3=num1+num2;//1
//			num1=num2;//1
//			num2=num3;//1
//		}
		for(int i=0;i<=5;i++) {
			System.out.println(num1);
			int num3=num1+num2;
			num1=num2;
			num2=num3;
		}
	}

}
