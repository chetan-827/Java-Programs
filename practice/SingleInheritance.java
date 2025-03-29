package practice;

class Animal {

	void printA() {
		System.out.println("lion is the king ");
	}
}
//This is single level inheritance
class Dog extends Animal {
	void printB() {
		System.out.println("Dog is barking");
	}
}
//This is multilevel inheritance
class forest extends Dog {
	void printC() {
		System.out.println("All animals are in the forest");
	}
}
//This is hierarchical inheritance
class cat extends Animal{
	void printD() {
		System.out.println("cat says meow");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		forest f = new forest();
		cat c=new cat();
		f.printA();
		f.printB();
		f.printC();
		c.printA();
		c.printD();
	}

}
