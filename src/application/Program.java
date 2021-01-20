package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc;

		System.out.println("### BANK ###\n");

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holderName = sc.nextLine();
			
		System.out.print("Is there an inicial deposit (y/n)? "); 
		char question = sc.next().charAt(0);
		 
		if (question == 'n' || question == 'N') {
			acc = new Account(accountNumber, holderName);
		 }
		else {
			System.out.print("Enter inicial deposit value: ");
			double depositValue = sc.nextDouble();
			acc = new Account(accountNumber, holderName, depositValue);
		}
		 
		System.out.println("\nAccount data: ");
		System.out.println(acc);
		
		System.out.print("\nEnter a deposit value: ");
		double deposit = sc.nextDouble();
		acc.deposit(deposit);
		
		System.out.println("\nUpdated accout data: ");
		System.out.println(acc);
		
		System.out.print("\nEnter a withdraw value: ");
		double withdraw = sc.nextDouble();
		acc.withdraw(withdraw);
		
		System.out.println("\nUpdated accout data: ");
		System.out.println(acc);
		
		sc.close();
	}
}






