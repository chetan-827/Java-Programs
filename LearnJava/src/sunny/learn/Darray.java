package sunny.learn;

public class Darray {

	public static void main(String[] args) {
		String[][] cars=new String[3][3];
		
		cars[0][0]="cam";
		cars[0][1]="ram";
		cars[0][2]="sam";
		cars[1][0]="cam";
		cars[1][1]="sam";
		cars[1][2]="ram";
		cars[2][0]="do";
		cars[2][1]="ghu";
		cars[2][2]="mam";
		
		for(int i=0;i<cars.length;i++) {
			System.out.println();
			for(int j=0;j<cars[i].length;j++) {
				System.out.print(cars[i][j]+" ");
			}
		}
	}

}
