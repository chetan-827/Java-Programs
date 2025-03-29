package practice;

public class object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sunny=new Student();
	//	Student sunny=new Student();
//		sunny.rno=55;
//		sunny.marks=67f;
//		sunny.name="chetan";
		sunny.greetings();
		sunny.changeName("tealover");
		
		System.out.println(sunny.roll);
		System.out.println(sunny.name);
		System.out.println(sunny.marks);
	}

}
class Student{
	int roll;
	String name;
	float marks;
	
	void greetings() {
		System.out.println("hello my name is "+this.name);
	}
	void changeName(String newName) {
		name =newName;
	}
	Student(){
		this.roll=13;
		this.marks=67;
		this.name="sai";
	}
	Student(int roll,String name,float marks){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
}
