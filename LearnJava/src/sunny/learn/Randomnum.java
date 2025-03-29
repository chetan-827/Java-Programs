package sunny.learn;
import java.util.Random;
public class Randomnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		int x=random.nextInt(6)+1;
		boolean y=random.nextBoolean();
		System.out.println(x);
		System.out.println(y);
	}

}
