package practice;

import java.util.ArrayList;
import java.util.Collections;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=7, num2=8, num3=6;
		if(num1>=num2 && num1>=num3) {
			System.out.println(num1+" is the largest num");
		}else if(num2>=num1 && num2>=num3) {
			System.out.println(num2+" is the largest num");
		}else {
			System.out.println(num3+" is the largest num");
		}
		
		ArrayList<Integer>x=new ArrayList<Integer>();
		x.add(10);
		x.add(20);
		x.add(30);
		System.out.println(Collections.max(x)+" is the largest num");
	}

}
