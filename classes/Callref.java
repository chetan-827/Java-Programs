package classes;
//call by ref
public class Callref {
	int a;
	int b;

	private static void add(Callref op, Callref op1) {
		op.a = 10;
		System.out.println("Result from method " + (op.a + op.b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callref op = new Callref();
		Callref op1 = new Callref();
		op.a = 2;
		op.b = 3;
		System.out.println("Before passing "+(op.a+op.b));
		add(op, op);// call method
		System.out.println("result from main " + (op.a + op.b));
	}

}
