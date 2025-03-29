package variables;

import java.util.Arrays;

public class Arrayconsecutive {
	public static int solution(int[] status) {
//		Arrays.sort(statues);//{2,3,6,8}
//		int minsize = statues[0];//here min is 2
//		int maxsize = statues[statues.length -1];//here max is 8;-1 means negative index
//
//		int totalRange = maxsize - minsize + 1;//8-2+1=7
//		int existingstatues = statues.length;//total nums is 4
//
//		return totalRange - existingstatues;//7-4
		Arrays.sort(status);
		int minsize=status[0];
		int maxsize=status[status.length -1];
		
		int totalRange=maxsize-minsize + 1;
		int existingstatus=status.length;
		
		return totalRange - existingstatus;
	}

	public static void main(String[] args) {
	
		int[] status = { 6, 2, 3, 8 };
		System.out.println(solution(status)); // Outputs 3
	}

}
