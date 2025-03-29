package variables;

public class MaxMultiple {
	static int solution(int divisor, int bound) {
	    return (bound / divisor) * divisor;
	}
	public static void main(String[] args) {
		int divisor = 3;
        int bound = 10;
        
        int result = solution(divisor, bound);
        System.out.println(result);
	}
}
