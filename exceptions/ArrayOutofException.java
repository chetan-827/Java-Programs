package exceptions;

import java.io.Console;

public class ArrayOutofException {

	public static void main(String[] args) {
		
		try {
			int[] numbers= {1,2,3};
			System.out.println(numbers[1]);
		}catch (Exception e) {
			System.out.println("something went wrong");
			System.out.println(e);
		}finally {
			System.out.println("Try catch is excuted");
		}
		Console console=System.console();
		String input=console.readLine("Enter some txt:");
		console.printf("You entered: %s%n", input);
	}

}
