package practice;

public class LinearSearch {
	
	public static int search(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {

		int[] arr = {10, 20, 30, 40, 50};
		int key=30;
		int result =search(arr,key);
		if(result == 1) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
	}

}
