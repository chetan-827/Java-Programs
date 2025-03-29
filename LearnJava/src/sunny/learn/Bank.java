package sunny.learn;
class A{
	public void display() {
		System.out.println("hello");
	}
}
public class Bank {
	String name="sbi";
	public void deposite() {
		System.out.println("i deposite my money");
	}
	public void deposite1() {
		System.out.println("I am not depositing");
	}
	public int cash() {
		
		return 1000;
	}
	public static void main(String[] args) {
		
		Bank b=new Bank();
	//	b.name="cbi";
		System.out.println(b.name);
		b.deposite();
		b.deposite1();
		b.cash();
		System.out.println(b.cash());
		
		A a=new A();
		a.display();
	}

}
