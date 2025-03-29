package practice;

public class IsNumeric {

	public static void main(String[] args) {
		
		String str="2";
		String str1="hello123";
		System.out.println(isNumeric(str1));
		System.out.println(isNumeric(str));
	}
	
	public static boolean isNumeric(String str) {
		return str.matches("\\d+");
	}
}
