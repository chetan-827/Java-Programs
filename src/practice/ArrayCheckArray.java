package practice;

public class ArrayCheckArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		int n=arr.length;
		int sumfirsthalf=0,sumsecondhalf=0;
		
		for(int i=0;i<n/2;i++) {
			sumfirsthalf=sumfirsthalf+arr[i];
		}
		System.out.println(sumfirsthalf);
		for(int i=n/2;i<n;i++) {
			sumsecondhalf=sumsecondhalf+arr[i];
		}
		System.out.println(sumsecondhalf);
		
		if(sumfirsthalf<sumsecondhalf) {
			reverseArray(arr);
		}
		
		System.out.println("Resulting array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	public static void reverseArray(int[] arr) {
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
	}

}
