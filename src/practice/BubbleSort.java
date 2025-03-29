package practice;

public class BubbleSort {

	public static void bubblesort(int[] arr) {
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr= {12,23,53,14};
		System.out.println("Original array");
		printArray(arr);
		
		bubblesort(arr);
		
		System.out.println("Sorted array");
		printArray(arr);
	}

}
