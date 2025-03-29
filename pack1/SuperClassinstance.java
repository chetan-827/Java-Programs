package pack1;
//Super can be used to refer immediate parent class instance variable.
class Animal{
	String color="white";
	void eat() {
		System.out.println("eating..");
	}
	Animal(){//super is used to invoke parent class constructor.
		System.out.println("Animals leave in the forest");
	}
	
}

class Dog extends Animal{
	String color="Black";
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
//	void eat() {
//		System.out.println("eating bread");
//	}
	void bark() {
		
		System.out.println("barking");
	}
	void work() {
		//super can be used to invoke parent class.subclass contains the same method as parent class.it is used if method is overridden.
		super.eat();
		bark();
	}
	Dog(){//when we define constructor 
		super();
		System.out.println("Dog is created");
	}
	
}
public class SuperClassinstance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.printColor();
		d.work();
	}
}