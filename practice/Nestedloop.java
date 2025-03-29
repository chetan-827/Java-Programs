package practice;

public class Nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print((i*j)+" ");
			}
			System.out.println();
			}
		for(int i=100;i>=1;i--) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		int i=1;
		while(i<100) {
			if(i%2==0)
				System.out.println(i+" ");
			i++;
		}
	}	
	
}
