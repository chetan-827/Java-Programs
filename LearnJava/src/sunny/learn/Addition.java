package sunny.learn;

public class Addition {
	int num1=10;
	int num2=20;
	
	public void sum(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	public static void main(String[] args) {
		
		Addition add=new Addition();
		//System.out.println(add.num1+add.num2);
		add.sum(20,40,45);
	}

}
