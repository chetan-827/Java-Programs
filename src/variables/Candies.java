package variables;

public class Candies {
	public static int solution(int n, int m) {
		int candies = m / n;
		return candies * n;
	}

	public static void main(String[] args) {
		System.out.println(solution(3,10));
	}
}
