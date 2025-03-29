package classes;
class Animals{
	void animalsound() {
		System.out.println("The animal make sound");
	}

}
class lion extends Animals{
	void animalsound() {
		System.out.println("Lion roar");
	}
}
class Dog extends Animals{
	void animalsound() {
		System.out.println("Dog lives in the street");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		Animals a=new Animals();
		Animals d=new Dog();
		lion l=new lion();
		a.animalsound();
		d.animalsound();
		l.animalsound();
	}

}
