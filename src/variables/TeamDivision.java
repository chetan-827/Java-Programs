package variables;

public class TeamDivision {
	public static int[] solution(int[] weights) {
        // Initialize the totals for both teams
        int team1Total = 0;
        int team2Total = 0;
        
        // Iterate through the weights array
        for (int i = 0; i < weights.length; i++) {
            // Add weight to team 1 if index is even, otherwise add to team 2
            if (i % 2 == 0) {
                team1Total += weights[i];
            } else {
                team2Total += weights[i];
            }
        }
        
        // Return the results as an array of two integers
        return new int[] {team1Total, team2Total};
    }

    public static void main(String[] args) {
        // Test the function with a sample input
        int[] weights = {50, 60, 60, 45, 70};
        int[] result = solution(weights);
        
        // Print the result
        System.out.println("Team 1 Total: " + result[0]);
        System.out.println("Team 2 Total: " + result[1]);
    }
}
