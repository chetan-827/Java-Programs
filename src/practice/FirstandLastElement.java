package practice;

import java.util.ArrayList;

public class FirstandLastElement {

	public static void main(String[] args) {

		ArrayList<Integer>list=new ArrayList<Integer>();
		int[] array= {1,3,5,7,4,3};
		for(int num:array) {
			list.add(num);
		}
		int first=list.get(0);
		int last=list.get(list.size()-1);
		System.out.println("first num is:"+first);
		System.out.println("Second num is:"+last);
	}

}
