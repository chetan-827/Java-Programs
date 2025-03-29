package pack1;
class Car{
	public String carname;
	// parameterized constructor
	public Car(String carname) {
		this.carname=carname;
	}
	//copy constructor(constructor that takes an object of the same class)
	public Car(Car cw) {
		this.carname=cw.carname;
	}
	
}
public class CarConst {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car original=new Car("BMW");
		System.out.println(original.carname);
		Car copied=new Car(original);
		System.out.println(copied.carname);
	}

}
