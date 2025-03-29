package variables;

public class Circleofnumbers {
	public static int solution(int n, int firstNumber) {
        return (firstNumber + n / 2) % n;
    }

    public static void main(String[] args) {
        int n = 10;
        int firstNumber = 2;
        int result = solution(n, firstNumber);
        System.out.println(result);  // Output: 7
    }
}
