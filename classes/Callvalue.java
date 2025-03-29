package classes;

//call by value
public class Callvalue {
	int a;
	int b;

	public static void add(int s, int t) {
		s = 10;
		System.out.println("Result from Method " + (s + t));
	}

	public static void main(String[] args) {
		
		Callvalue cv = new Callvalue();
		cv.a = 2;
		cv.b = 5;
		System.out.println("Before passing " + (cv.a + cv.b));
		add(cv.a, cv.b);//argu
		System.out.println("after passing " + (cv.a + cv.b));
	}

}
