package variables;

//largest number that contains exactly n digits
public class Largestnumber {
	public static int solution(int n) {
		return (int) Math.pow(10, n) - 1;// 10^2-1=100-1=99
	}

	public static void main(String[] args) {
		System.out.println(solution(2));
	}
}