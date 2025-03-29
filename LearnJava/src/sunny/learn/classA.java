package sunny.learn;

public class classA {
	public int age=22;
	
	public int times=3;
	
	Javabeen jb=new Javabeen();
	public void sleep() {
		
		jb.setTimes(5);
		System.out.println("I am sleeping "+jb.getTimes()+" time in a day");
	}
	public static void main(String[] args) {
		
		classA clsA=new classA();
		clsA.sleep();
	}
class classB{
	
}
}
