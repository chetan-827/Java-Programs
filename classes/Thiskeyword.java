package classes;

public class Thiskeyword {
	String name;

	Thiskeyword(String n) {
		name = n;
	}

	void display() {
		this.display1(); // this can be used to invoke current class method
		System.out.println("My name is " + name);
	}

	void display1() {
		System.out.println("This is method");
	}

	public static void main(String[] args) {
		
		Thiskeyword t = new Thiskeyword("cherry");
		t.display();
	}

}
