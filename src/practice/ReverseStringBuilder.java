package practice;

public class ReverseStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="welcome to java learning";
		StringBuilder input1=new StringBuilder();
		input1.append(input);
		input1.reverse();
		System.out.println(input1);
		
		//String Buffer
		String str="Java learning";
		StringBuffer sbr=new StringBuffer(str);
		sbr.reverse();
		System.out.println(sbr);
	}

}
