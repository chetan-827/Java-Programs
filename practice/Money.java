package practice;

public class Money {

	void s(Money obj) {
		System.out.println("This can be passed as argument in the method call");
	}
	void m() {
		s(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Money t=new Money();
		t.m();
	}

}
