package sunny.learn;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> food= new ArrayList<String>();
		
		food.add("Pizza");
		food.add("hotdog");
		
		food.set(0, "burger");
		food.remove(1);
		food.clear();
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
	}

}
