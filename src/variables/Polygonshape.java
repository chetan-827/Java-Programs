package variables;

public class Polygonshape {
	public static int solution(int n) {
		return n*n+(n-1)*(n-1);
	}
	public static void main(String[] args) {
		System.out.println(solution(2));
		System.out.println(solution(3));
	}

}
