package pack2;

public class OverloadingCalculation {
	void sum(int a,long b) {
		System.out.println(a+b);
	}
	void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		OverloadingCalculation obj=new OverloadingCalculation();
		obj.sum(4, 5);
		obj.sum(25,30);
	}

}
