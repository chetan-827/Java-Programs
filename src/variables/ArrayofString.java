package variables;
import java.util.ArrayList;
import java.util.List;
public class ArrayofString {
	public static String[] solution(String[] inputArray) {
		int maxLength=0;
		//Find the max length of the String
		for(String str:inputArray) {
			if(str.length()>maxLength) {
				maxLength=str.length();
			}
		}
		//collect all strings that have max length
		List<String>longestStrings=new ArrayList<>();
		for(String str: inputArray) {
			if(str.length()==maxLength) {
				longestStrings.add(str);
			}
		}
		//convert the list to an array and return
		return longestStrings.toArray(new String[0]);
	}
	
	public static void main(String[] args) {
		String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
        String[] result = solution(inputArray);

        // Output: ["aba", "vcd", "aba"]
        for (String str : result) {
            System.out.println(str);
        }
	}
}