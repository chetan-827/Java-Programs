package pack2;

public class ParameterConstructor {
	int id;
	String name;
	int age;

	public ParameterConstructor(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	public ParameterConstructor(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name + age);
	}

	class cube {
		static int cube(int x) {
			return x * x * x;
		}
	}
	class adder {
		static int add(int a, int b) {
			return (a + b);
		}
		
		static double add(double a, double b) {
			return (a + b);
		}
	}
	public static void main(String[] args) {

		ParameterConstructor s1 = new ParameterConstructor(111, "sunny");
		ParameterConstructor s2 = new ParameterConstructor(112, "chetan", 9);
		s1.display();
		s2.display();
		int result = cube.cube(5);
		System.out.println(result);
		System.out.println(adder.add(55, 56));
		// System.out.println(cube.add(55,56));
	}
}
