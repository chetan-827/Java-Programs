package pack2;
//Method without overriding
class Vehicle {
	void run() {
		System.out.println("vehicle is runnning");
	}
}

class Bike extends Vehicle {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.run();
	}
}
