package sunny.learn;

import java.util.ArrayList;

public class Mainarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> groceryList=new ArrayList<ArrayList<String>>();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("pasta");
		bakeryList.add("cake");
		
		ArrayList<String> producelist = new ArrayList<String>();
		producelist.add("pasta");
		producelist.add("cake");
		
		groceryList.add(producelist);
		groceryList.add(bakeryList);
		
		System.out.println(groceryList);
		
	//	ArrayList<String> animals=new ArrayList<String>();
		String[]animals ={"cat","dog","Eagle","lion","tiger"}; 
		
	//	animals.add("cat");
	//	animals.add("dog");
		
		for(String i:animals) {
			System.out.println(i);
		}
	}

}
