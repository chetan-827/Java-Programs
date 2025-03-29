package practice;
class F{//If you make any class as final,you cannot extend it.
	void fun() {
		System.out.println("hello");
	}
}
public class Final extends F {
	final int a=10;//If you make any method as final, you cannot change the value of final variable(it will be constant)
	void fun() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		F f= new Final();
		f.fun();//If you make any method as final,you cannot override it.
		//System.out.println(f.a);
	}

}
