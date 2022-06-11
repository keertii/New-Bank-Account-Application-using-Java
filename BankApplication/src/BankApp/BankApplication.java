package BankApp;

import java.util.LinkedList;
import java.util.List;

public class BankApplication {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();
		
		//read a csv file then create new account based on data
		String file = "C:\\Users\\keert\\OneDrive\\Desktop\\New-Bank-Account-Application-using-JAVA\\NewBankAccounts.csv";
		
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for( String[] accountHolder : newAccountHolders) {
			//System.out.println("New Account: ");
			String name = accountHolder[0];
			String SSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			//System.out.println(name + " " + SSN + " " + accountType + " $" + initDeposit);
			if (accountType.equals("Savings")){
				System.out.println("Open a savings account");
				accounts.add(new Savings(name, SSN, initDeposit));}
			else if (accountType.equals("Checking")){
				System.out.println("Open a checkings account");
				accounts.add(new Checking(name, SSN, initDeposit));}
			else {
				System.out.println("Error reading account");}
		}
			
		for( Account acc : accounts) {
			System.out.println("\n****************************************************");
			acc.showInfo();
				}
	}
		
}