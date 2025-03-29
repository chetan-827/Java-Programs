package pack2;

//If subclass has the same method as declared in the parent class it is know as method overriding in java.
//method overriding is used for runtime polymorphism.
class Car {
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Passenger extends Car {
	void run() {
		System.out.println("This is MethodOverriding method");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Passenger v=new Passenger();
		v.run();
	}
}
