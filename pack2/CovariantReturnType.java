package pack2;

class A{
	A get() {
		return this;
	}
	
}
class B1 extends A{
	B1 get() {
		return this;
	}
	void message() {
		System.out.println("Welcome to covariant return type");
	}
}
public class CovariantReturnType {

	public static void main(String[] args) {
		new B1().get().message();
	}

}
