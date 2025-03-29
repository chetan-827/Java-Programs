package variables;

public class VariableNameValidator {
	public static boolean solution(String name) {
		// Check if the string is empty or starts with a digit
		if (name == null || name.isEmpty() || Character.isDigit(name.charAt(0))) {
			return false;
		}

		// Check if all characters are valid (letters, digits, or underscores)
		for (char c : name.toCharArray()) {
			if (!Character.isLetterOrDigit(c) && c != '_') {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// Test cases
		String name1 = "var_1__Int";
		String name2 = "qq-q";
		String name3 = "2w2";
		String name4 = "a";
		String name5 = "varable-4";

		System.out.println(solution(name1)); // Output should be true
		System.out.println(solution(name2)); // Output should be false
		System.out.println(solution(name3)); // Output should be false
		System.out.println(solution(name4));
		System.out.println(solution(name5));
	}
}