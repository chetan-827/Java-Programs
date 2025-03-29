package pack1;

import java.util.Scanner;

class Teach{
	public String name;
	public int age;
	
	public Teach(String name,int  age) {
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
	}
}
public class CodechufConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name=sc.next();
		int age=sc.nextInt();
		
		Teach obj=new Teach(name,age);
		obj.display();
		sc.close();
	}

}
