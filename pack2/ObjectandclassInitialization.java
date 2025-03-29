package pack2;
class student{
	int rollno;
	String name;
	void insertRecord(int r,String n) {
		rollno=r;
		name=n;
	}	
	void display() {
		System.out.println(rollno+" "+name);
	}
}
public class ObjectandclassInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student();
		student s2=new student();
		s1.insertRecord(55,"chetan");
		s1.display();
		s2.insertRecord(12, "sunny");
		s2.display();
	}
}
