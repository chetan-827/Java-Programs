package practice;

import java.util.HashMap;

public class ElementFrequency {

	public static void main(String[] args) {
		int[] arr= {1,2,2,3,4,4,5,5,5,5};
		
		HashMap<Integer, Integer> frequencyMap=new HashMap<>();
		
		for(int num:arr) {
			if(frequencyMap.containsKey(num)) {
				frequencyMap.put(num, frequencyMap.get(num)+1);
			}else {
				frequencyMap.put(num, 1);
			}
		}
		
		for(int key: frequencyMap.keySet()) {
			System.out.println(key+ ": "+frequencyMap.get(key));
		}
		
	}

}
