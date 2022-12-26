package japidersproject.bank;

import java.util.Scanner;

public class Solution {
	public static void main(String args[])
	{
		Bank  bank= new Bankimp1(5000);//upcatsing

   while(true) {
		Scanner sc= new Scanner(System.in);
		System.out.println("1:Deposite  Amount\n2:Withdraw Amount:");
		System.out.println("3:Check balance\n4:Exit:");
		System.out.println("Enter  choice:");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter anount to   be Deposite");
			int amtDeposite=sc.nextInt();
			bank.deposite(amtDeposite); // bank.deposite(scan.nextInt());
			break;
		case 2:
			System.out.println("Enter anount tobe Withdraw");
			int amtwithdraw=sc.nextInt();
			bank.withdraw(amtwithdraw); // bank.withdraw(scan.nextInt());
			break;
		case 3:
			System.out.println("Available Balance  Rs.:"+bank.getBalanace());
			break;
		case  4:
			System.out.println("Thank you");
			System.exit(0);
		default:
			System.out.println(bank.displayErrorMessages());
		}// end of swoth statement
			System.out.println("----------");
		}// End of while loop
	}
}




