package variables;

public class Twodigitinteger {
	public static int solution(int n) {
		int tensdigit = n / 10;//2
		int unitsdigit = n % 10;//9
		return tensdigit + unitsdigit;//11
	}

	public static void main(String[] args) {
		System.out.println(solution(29));
	}
}
