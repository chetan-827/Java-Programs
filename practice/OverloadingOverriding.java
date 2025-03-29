package practice;

class Animals{
	static void run1() {
		System.out.println("h--animal is running");
	}
	void run2() {
		System.out.println("o--animal is running");
	}
}
class cheetah extends Animals{
	static void run1() {
		System.out.println("h--cheetah runs fastly");
	}
	void run2() {
		System.out.println("o--cheetah runs fastly");
	}
}
public class OverloadingOverriding {

	public static void main(String[] args) {
		Animals a=new Animals();
		a.run1();
		a.run2();
		cheetah c=new cheetah();
		c.run2();
		c.run1();
		Animals b=new cheetah();
		b.run1();//hiding
		b.run2();//overriding

	}

}
