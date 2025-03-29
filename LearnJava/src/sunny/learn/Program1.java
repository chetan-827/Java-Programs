package sunny.learn;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your name?");
		String name = sc.nextLine();
		
		System.out.println("how old are you?");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("what is your favourite food?");
		String food=sc.nextLine();
		
		System.out.println("hello "+name);
		System.out.println("I am "+age);
		System.out.println("I like "+ food);
		
		sc.close();
	}

}
