package sunny.learn;
import java.util.ArrayList;
import java.util.List;
public class switchstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=30;
		switch(age) {
		case 20: System.out.println("age is 20");
		break;
		
		case 40: System.out.println("age is 40");
		break;
		
		default : System.out.println("age is other");
		}
		List<String> list=new ArrayList<String>();
		
		list.add("Bengalore");
		list.add("chennai");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
