package sunny.learn;
abstract class class1{
	abstract public void play();
	public void eat() {
		System.out.println("i am eating");
	}
}
public class abstraction extends class1 {
	public void play() {
		System.out.println("i am playing");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstraction ae=new abstraction();
		ae.play();
		ae.eat();
	}

}
