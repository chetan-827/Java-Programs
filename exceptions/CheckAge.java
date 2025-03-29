package exceptions;

import java.io.FileNotFoundException;

public class CheckAge {
	static void checkage(int age) {
		if (age<18) {
			throw new ArithmeticException("Access denied: you must be atleast 18 years old");
		}else {
			System.out.println("Access denied: You are old enough");
		}
	}
	public static void main(String[] args) {
		checkage(21);
		String str1 = "apple,banana,orange";

		String[] fruits = str1.split(",");

		String str2 = fruits[1];

		String str3 = str2.substring(1, 3);

		System.out.println(str3);
		
	}

}

