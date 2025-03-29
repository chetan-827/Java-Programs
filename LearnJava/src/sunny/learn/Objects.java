package sunny.learn;

public class Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar1=new Car();
		Car mycar2=new Car();
		
		Human human=new Human("chetan",23,55);
		
		System.out.println(human.weight);
		System.out.println(human.age);
		
		human.eat();
		human.drink();
		
		mycar1.drive();	
		mycar2.brake();
		
		System.out.println(mycar1.colour);
		System.out.println(mycar2.company);
		System.out.println(mycar1.price);
	}
	
	
}

