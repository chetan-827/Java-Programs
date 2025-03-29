package practice;

public class Constructorclass {

	String color;
	String model;

	public Constructorclass(String color, String model) {

		this.color = color;
		this.model = model;
	}

	public void displayDetails() {
		System.out.println("Color: " + color);
		System.out.println("Model: " + model);
	}

	public static void main(String[] args) {

		Constructorclass mycar = new Constructorclass("red", "swift");
		mycar.displayDetails();

	}

}
