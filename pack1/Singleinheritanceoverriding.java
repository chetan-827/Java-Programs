package pack1;
class Collage{
	void section() {
		System.out.println("Ece-a");
	}
}
class Employee extends Collage{
	void section() {
		System.out.println("Ece-b");
	}
}
class Staff extends Collage{
	void section() {
		System.out.println("Ece-c");
	}
}
public class Singleinheritanceoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collage c=new Employee();
		Collage c1=new Staff();
		
		c.section();
		c1.section();
	}

}
