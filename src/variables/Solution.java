package variables;

public class Solution {
	public static int getCentury(int year) {
		return (year + 99) / 100;
	}

	public static void main(String[] args) {
		// Example usage
		System.out.println(getCentury(1905));
		System.out.println(getCentury(2000));
		System.out.println(getCentury(2001));
	}

}
