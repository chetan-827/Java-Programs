package practice;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 2, 32, 21, 43, 52, 99 };

		int secondLargest = findSecondLargest(arr);

		if (secondLargest != Integer.MIN_VALUE) {
			System.out.println(secondLargest);
		} else {
			System.out.println("There is no second largest element");
		}
	}

	public static int findSecondLargest(int[] arr) {
		if (arr.length < 2) {
			return Integer.MIN_VALUE;
		}

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}
		return secondLargest;
	}
}
