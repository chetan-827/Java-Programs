package pack1;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			
			System.out.println(a[i]);
		}
		int b[][]= {{12,22},{13,14},{23,67}};
		for(int i=0; i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("a["+i+ "]["+j+"]="+b[i][j]);
			}
		}

	}
}
