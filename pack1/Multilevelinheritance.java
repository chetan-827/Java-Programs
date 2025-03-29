package pack1;
class Zoo{
	protected String name;
	
	void Animal(String name){
		this.name=name;
	}
	void eat() {
		System.out.println(name+"is eating ");
	}
}
class mammel extends Zoo{
	protected int numlegs;
	mammel(String name,int numlegs){
		//super(name);
		this.numlegs=numlegs;
	}
	void walk() {
		System.out.println(name+"is walking on "+numlegs+"legs");
	}
	}
class Dogs extends mammel{
	Dogs(String name,int numlegs){
		super(name,numlegs);
	}
	void bark() {
		System.out.println(name+" is barking");
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs D=new Dogs("puppy",4);
		D.eat();
		D.walk();
		D.bark();
	}

}
