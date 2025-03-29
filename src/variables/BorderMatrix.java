package variables;

public class BorderMatrix {
	public static String[] solution(String[] picture) {
        // Determine the number of columns in the original picture
        int numCols = picture[0].length();
        // Create the border row which is one more than the number of columns
        String borderRow = "*".repeat(numCols + 2);
        
        // Initialize the result with the border rows
        String[] borderedPicture = new String[picture.length + 2];
        borderedPicture[0] = borderRow; // Top border
        borderedPicture[borderedPicture.length - 1] = borderRow; // Bottom border
        
        // Add the borders to the left and right of each original row
        for (int i = 0; i < picture.length; i++) {
            borderedPicture[i + 1] = "*" + picture[i] + "*";
        }
        
        return borderedPicture;
    }
    
    public static void main(String[] args) {
        // Test the function with the sample input
        String[] picture = {"abc", "ded"};
        String[] result = solution(picture);
        
        // Print the result
        for (String row : result) {
            System.out.println(row);
        }
    }
}
