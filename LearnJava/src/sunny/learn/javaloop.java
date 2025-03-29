package sunny.learn;

public class javaloop {
	public void loop(){
		System.out.println("my name is chetan");
	}
	public static void main(String[] args) {
		
		int sum=0;
		javaloop jloop=new javaloop();
		for(int i=0;i<=5;i++) {
			jloop.loop();
		}
		while(sum <= 30) {
			sum = sum + 10;
		}
		System.out.println(sum);
	}
	
}
