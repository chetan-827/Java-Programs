package practice;

public class SimpleArraySearch {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80};
		
		int target=40;
		
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
				break;
			}
		}
		
		if(index!=-1) {
			System.out.println("Element found at index: "+index);
		}else {
			System.out.println("Element not found in the array");
		}

	}

}
