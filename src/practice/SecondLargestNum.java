package practice;

import java.util.Arrays;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayList= {4,3,5,6,8,9,23,45,22};
		int num=arrayList.length;
		Arrays.sort(arrayList);
		System.out.println("Second largest num"+arrayList[num-2]);
		System.out.println("second smallest num"+arrayList[1]);
	}

}
