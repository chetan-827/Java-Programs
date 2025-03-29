package variables;

public class Palindrome {
	public static boolean solution(String input) {
		// Convert to lowercase for a case-insensitive check
		String s=input.toUpperCase();
		// Reverse the string and compare
		String rs=new StringBuilder(s).reverse().toString();
		return s.equals(rs);
	}
	public static void main(String[] args) {
		System.out.println(solution("aabaa")); 
	    System.out.println(solution("abaa")); 
	    System.out.println(solution("abba")); 

	}

}
