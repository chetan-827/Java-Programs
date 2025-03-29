package classes;

public class Cons {
	int a;
	String b;
	Cons(int c, String d){
		a=c;
		b=d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons c=new Cons(45," chetan");
		System.out.println(c.a+c.b);
	}

}
