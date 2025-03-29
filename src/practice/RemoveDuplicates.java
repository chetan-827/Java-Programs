package practice;

import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="heelo";
		System.out.println(removeDuplicates(str));
	}
	
	public static String removeDuplicates(String str){
		StringBuilder sb=new StringBuilder();
		HashSet<Character> seen=new HashSet<>();
		for(char ch:str.toCharArray()) {
			if(seen.add(ch)) {
				sb.append(ch);
			}
		}
		return sb.toString();
		
	}
}
