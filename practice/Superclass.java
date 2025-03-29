package practice;
class Device{
	String n="LG TV";
	void display() {
		System.out.println(n);
		System.out.println("hello");
	}
	Device(){
		System.out.println("I am device");
	}
}
class Tv extends Device{
	String n="sony Tv";
	void display() {
		System.out.println(super.n);//super can be used to refer immediate parent class instance in the variable.
		System.out.println(n);
		System.out.println("electronics");
		super.display();//super can be used to invoke immediate parent class method.
	}
	Tv(){
		super();//super can be used to invoke immediate parent class constructor
		System.out.println("I am tv");
	}
}
public class Superclass {
	
	public static void main(String[] args) {
		
		Tv t=new Tv();
		t.display();
		
	}
}