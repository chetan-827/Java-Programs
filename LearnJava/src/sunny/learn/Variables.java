package sunny.learn;

public class Variables {
	int x=120;				//instance variable
	static int y=150;		//static variable
	public void display() {
		int a=100;			//local variable
		System.out.println(a);
		System.out.println(y);
	}
	public static void main(String[] args) {
		
		Variables var=new Variables();
		var.display();
		System.out.println(var.x);
		System.out.println(var.y);
	}

}
