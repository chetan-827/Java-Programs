package variables;

import java.util.Stack;

public class Reverseinparentheses {
	public static String solution(String inputString) {
		Stack<String> stack = new Stack<>();
		StringBuilder current = new StringBuilder();

		for (char ch : inputString.toCharArray()) {
			if (ch == '(') {
				// Push the current result onto the stack
				stack.push(current.toString());
				// Start a new result for the content within parentheses
				current = new StringBuilder();
			} else if (ch == ')') {
				// Reverse the content within the parentheses
				StringBuilder temp = current.reverse();
				// Pop the top of the stack and append the reversed content
				current = new StringBuilder(stack.pop()).append(temp);
			} else {
				// Add normal characters to the current result
				current.append(ch);
			}
		}

		return current.toString();
	}

	public static void main(String[] args) {
		System.out.println(solution("(bar)")); // Output: "rab"
		System.out.println(solution("foo(bar)baz")); // Output: "foorabbaz"
		System.out.println(solution("foo(bar)baz(blim)")); // Output: "foorabbazmilb"
		System.out.println(solution("foo(bar(baz))blim")); // Output: "foobazrabblim"
	}
}
