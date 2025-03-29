package practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateandTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now=LocalDateTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println("Current Date and Time: "+now.format(formatter));
		
		try {
			int result=10/0;
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
	} 

}
