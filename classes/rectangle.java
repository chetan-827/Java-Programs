package classes;

class Rectangle {
	int length;
	int width;

	void insert(int l, int w) {
		length = l;
		width = w;
	}

	void area() {
		System.out.println(length * width);
	}

	public class angle {

		public static void main(String[] args) {
			Rectangle r1 = new Rectangle();
			r1.insert(11, 5);
			r1.area();
		}
	}
}