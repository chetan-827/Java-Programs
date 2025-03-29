package variables;

public class Arrayslowestage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ages[]= {20,304,73,874,23,4,42,4,24,1};
		int lowestAge=ages[0];
		for(int age:ages) {
			if(lowestAge>age) {
				lowestAge=age;
			}
		}
		System.out.println(lowestAge);
		
		int[][] Mynumbers= {{1,2,3,4,5},{6,7,8,9}};
		for(int[] row:Mynumbers) {
			for(int i:row) {
				System.out.println(i);
			}
		}
	}

}
