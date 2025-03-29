package practice;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long num=243423;
//		int count=0, num2=2324;
//		while(num!=0) {
//			num=num/10;
//			count++;
//		}
//		System.out.println("Number of digits:"+count);
		
		int number=4545;
		int count=0;
		
		while(number>0) {
			
			number=number/10;
			count++;
		}
		System.out.println(count);
		
//		String result=Integer.toString(num2);
//		System.out.println(+result.length());
	}

}
