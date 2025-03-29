package pack2;
//method 
class Bank {
	void getinterest() {
		System.out.println("Bank interest is: " + 0);
	}
}

class SBI extends Bank {
	void getinterest() {
		System.out.println("SBI interest: " + 2);
	}
}

class ICICI extends SBI {
	void getinterest() {
		System.out.println("ICICI interest: " + 3);
	}
}

public class MethodOverriding2 {

	public static void main(String[] args) {
		SBI s = new SBI();
		ICICI I = new ICICI();

		s.getinterest();
		I.getinterest();

	}

}
