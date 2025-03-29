package practice;

import java.util.Scanner;

public class MaxorMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max=n;
		int min=n;
		
		
			while(true) {
				n=sc.nextInt();
				
				if(n<0) {
					break;
				}
//				if(n>max) {
//					max=n;
//				}
//				if(n<min) {
//					min=n;
//				}
				max=n>max?n:max;
				min=n<min?n:min;
			}
			System.out.println("min="+min+"max="+max);
		
//		else {
//			System.out.println(n+"Is invalid");
//		}
		}

}
