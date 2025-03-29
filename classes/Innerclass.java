package classes;
class Outerclass{
	int x=10;
	
	static class Innerclass{
		int y=5;
	}
	
	
}
public class Innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outerclass myouter=new Outerclass();
	//	Outerclass.Innerclass myinner=myouter.new Innerclass();
	//	Outerclass.Innerclass myinner=new Outerclass.Innerclass();
		
		System.out.println(myouter.x);
	//	System.out.println(myinner.y);
	}

}
