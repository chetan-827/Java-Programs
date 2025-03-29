package variables;

public class Checkgiveninteger {
	public static boolean solution(int n) {
		// Convert the integer to a string
		String numberString = Integer.toString(n);

		// Iterate over each character in the string
		for (char c : numberString.toCharArray()) {
			// Convert the character to an integer digit
			int digit = c - '0';

			// Check if the digit is not even
			if (digit % 2 != 0) {
				return false;
			}
		}

		// All digits are even
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 248622;
		int n2 = 642386;
			
		System.out.println(solution(n1)); // Output should be true
		System.out.println(solution(n2)); // Output should be false
	}

}
