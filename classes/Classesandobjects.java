package classes;

class person {
	String name;
	int age;
	int rollno;

	void insertrecord(int r, String n) {
		rollno = r;
		name = n;
	}

	void displayinformation() {
		System.out.println(rollno + "     " + name);
	}

	void speak() {
		System.out.println("My name is " + name + " and i am " + age + " years old");
	}

	int getage() {
		return age;
	}

	int calculateage() {
		int yearsleft = 65 - age;
		return yearsleft;
	}

	String getname() {
		return name;
	}

	public void speak(String text) {
		System.out.println(text);
	}

	public void jump(int height) {
		System.out.println("Jumping :" + height);
	}
}

public class Classesandobjects {

	public static void main(String[] args) {
		person person1 = new person();
		person1.name = "sunny";
		person1.age = 23;
		// person1.speak();
		// System.out.println(person1.name);
		// System.out.println(person1.age);

		person person = new person();
		person.name = "cherry";
		person.age = 21;
		person.speak();
		// System.out.println(person.name);
		// System.out.println(person.age);

		int age = person1.getage();
		System.out.println("My age is:" + age);

		int years = person1.calculateage();
		System.out.println(years);

		String name = person.getname();
		System.out.println("My name is :" + name);

		person.speak("hello everyone");
		person.jump(22);

		person.insertrecord(111, "Karan");
		person1.insertrecord(222, "Aryan");
		person.displayinformation();
		person1.displayinformation();

	}

}