package classes;

public class Method1 {
	String name;
	static String description="color";;

	public static void mymethod(String name, int age) {
		System.out.println("hello");
		System.out.println("My name is: " + name + " I am " + age + " years old");
	}

	static void checkage(int age) {
		if (age < 18) {
			System.out.println("You are not elgible to vote");
		} else {
			System.out.println("You are elgible to vote");
		}
	}

	static int mycode(int x) {
		return 22 * x;
	}

	static int myadd(int x, int y) {
		return x + y;
	}

	static int plusmethod(int x, int y) {
		return x + y;
	}

	static double plusmethod(double x, double y) {
		return x + y;
	}

	public void showtime() {
		System.out.println(name);
	}

	public static void showinfo() {
		System.out.println("this is static method so directly call the function");
	}

	public static void main(String[] args) {
		mymethod("chetan", 22);
		checkage(22);
		System.out.println(mycode(5));
		System.out.println(myadd(5, 9));
		int mynum1 = plusmethod(5, 5);
		System.out.println("int:" + mynum1);
		double mynum2 = plusmethod(7.7, 8.4);
		System.out.println("double:" + mynum2);
		int x = 100;
		System.out.println(x);
		Method1 thing1 = new Method1();
		thing1.name = "raju";
		thing1.showtime();// this is non-static so need to create obj from class and then call the method
	//	thing1.description = "hello this is static ";
		showinfo(); // this is static so no need to create obj from class.directly can call the
					// function
		System.out.println(description);
	}

}
