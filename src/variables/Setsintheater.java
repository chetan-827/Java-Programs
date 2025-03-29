package variables;

public class Setsintheater {
	static int solution(int nCols, int nRows, int col, int row) {
		return (nRows - row) * (nCols - col + 1);
	}

	public static void main(String[] args) {
		int nCols = 16;
        int nRows = 11;
        int col = 5;
        int row = 3;
        
        int result = solution(nCols, nRows, col, row);
        System.out.println(result);
	}
}
