package pack1;
abstract class Teacher{
	public String fname="john";
	public int age=24;
	public abstract void study();//abstract method
}
class Student extends Teacher{
	public int gradutionyear=2024;
	public void study() {        //the body of the abstract method is provide here
		System.out.println("studying all day");
	}
}
public class Abstract {

	public static void main(String[] args) {
		Student st=new Student();
		
		System.out.println("Name: "+st.fname);
		System.out.println("age: "+st.age);
		System.out.println("gradutionyear: "+st.gradutionyear);
		st.study();

	}

}
