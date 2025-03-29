package pack1;

import java.util.Scanner;

class BankAccount{
	public static int totalBalance;
	public int amount;
	
	public BankAccount(int amount) {
		totalBalance+=amount;
	}
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int amount=sc.nextInt();
		BankAccount acc=new BankAccount(132);
		
		amount=sc.nextInt();
		BankAccount acc2=new BankAccount(23);
		System.out.println(acc2.totalBalance);
		
	}

}
