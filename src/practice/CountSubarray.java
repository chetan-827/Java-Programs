package practice;

public class CountSubarray {

	public static int countsubarray(int[] input1, int input2) {
		int count=0;
		
		for(int i=0;i<input2-2;i++) {
			int first=input1[i];
			int second=input1[i+1];
			int third=input1[i+2];
			
			if(first+third==second) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {

		int[] arr= {1,2,1,3,5,2,4,2};
		int n=arr.length;
		System.out.println(countsubarray(arr, n));
	}

}
