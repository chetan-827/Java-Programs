package classes;

abstract class Animal{
	//public abstract void animalsound();
	public void sleep() {
		System.out.println("Zzzz");
	}
}
class pig extends Animal{
	public void animalsound() {
		System.out.println("The pig says: wee wee");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		pig p=new pig();
		p.animalsound();
		p.sleep();
	}
}
