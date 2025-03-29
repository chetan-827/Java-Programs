package sunny.learn;

public class Car {
	
	String model="xcent";
	String company="huyndai";
	String colour="white";
	int price=700000;
	

	void drive() {
		System.out.println("you drive the car");
	}
	void brake() {
		System.out.println("you stop the car");
	}
	
}
	class Human{
	String name;
	int age;
	double weight;
	
	Human(String name,int age,double weight){
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	void eat() {
		System.out.println(this.age+ " is her roll number");
	}
	void drink() {
		System.out.println(this.name+" is drinking *Tea*");
	}
}
