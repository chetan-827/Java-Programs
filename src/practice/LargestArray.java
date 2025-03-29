package practice;

public class LargestArray {

	public static void main(String[] args) {
		// Define an integer array
		int[] arr= {12,2,34,52,55,57};
		
		// Assume the first element is the largest
		int max=arr[0];
		
		// loop through the array to find the maximum number
		for(int num:arr) {
			if(num>max) { // compare each element with max
				max=num;//update max if a larger num is found
			}
		}
		System.out.println("Largest Number:"+max);
	}

}
