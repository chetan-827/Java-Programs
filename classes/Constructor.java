package classes;

public class Constructor {
	int x;
	
	public Constructor(int y) {
		x=y;
		
	}
	Constructor(){
		System.out.println("Hii");
	}
	
	public static void main(String[] args) {
		Constructor con=new Constructor(5);
		System.out.println(con.x);
	}
}
