package practice;

public class Person {
	// Instance variables
	String name;
	int age;
	
	//Constructor
	Person(String name, int age) {
		//Using 'this' refer to instance variables
		this.name = name;
		this.age = age;
	}
	// Method to display person details
	void display() {
		System.out.println("Name:" + this.name);
		System.out.println("Age:" + this.age);
	}

	public static void main(String[] args) {
		// creating a object of person class
		Person p1 = new Person("sunny", 22);
		//calling the method
		p1.display();

	}

}
