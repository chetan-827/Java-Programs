package variables;

public class Array {
	public static int solution(int[] inputArray) {
        if (inputArray.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }
        
        int maxProduct = inputArray[0] * inputArray[1];
        
        for (int i = 1; i < inputArray.length - 1; i++) {
            int product = inputArray[i] * inputArray[i + 1];
            if (product > maxProduct) {
                maxProduct = product;
            }
        }
        
        return maxProduct;
    }

    public static void main(String[] args) {
        // Example usage
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        System.out.println(solution(inputArray)); // Outputs 21
    }
	
}
