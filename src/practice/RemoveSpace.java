package practice;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("Original String: " + input);
		input = input.replaceAll("\\s", "");
		System.out.println("Final String:"+input);
		
	}

}
