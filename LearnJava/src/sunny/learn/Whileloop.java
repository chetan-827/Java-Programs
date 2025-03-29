package sunny.learn;
import java.util.Scanner;
public class Whileloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name="";
		
		while(name.isBlank()) {
			System.out.println("enter your name");
			name=sc.nextLine();
		}	
		
		System.out.println("Hello "+name);
	}

}
