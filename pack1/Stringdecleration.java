package pack1;

public class Stringdecleration {

	public static void main(String[] args) {
		String s="cherry";
		String s1=new String("rrr");
		System.out.println(s.charAt(5));
		System.out.println(s.endsWith("ry"));
		System.out.println(s.concat(s1));
		System.out.println(s.equals(s1));
		System.out.println(s.indexOf('e'));
		System.out.println(s.isEmpty());
		System.out.println(s.length());
		System.out.println(s1.replace('r', 's'));
		
	}

}
