package classes;

public class Student {
	int roll;
	String name;
	public Student(int no,String name) {
		roll=no;
		this.name=name;
	}

	public static void main(String[] args) {
		Student s=new Student(55,"chetan ");
		System.out.println(s.name+s.roll);
		
	}

}
