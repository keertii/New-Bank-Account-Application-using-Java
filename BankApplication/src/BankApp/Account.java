package BankApp;

public abstract class Account implements IntrestRate{
	//list common properties for savings and checking account
	private String name;
	private  String SSN;
	private double balance;
	static int index =10000;
	
	protected String accountNumber;
	protected double rate;
	
	
	//constructor to set base properties and initialize the account
	public Account(String name, String SSN, double initDeposit) {
		this.name = name;
		this.SSN = SSN;
		balance = initDeposit;
		//System.out.println("Name: " + name + " "+ "SSN: " + SSN + " " + "Balance:"   +balance );
		
		//set account no.
		index++;
		this.accountNumber = setAccountNumber();
		
		setRate();
	}
	public abstract void setRate();
	
	
	private String setAccountNumber() {
		String lastTwoOfSsn = SSN.substring(SSN.length()-2, SSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		
 		return lastTwoOfSsn + uniqueID + randomNumber ;
	}
	
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest is $" + accruedInterest);
		printBalance();
		
	}
	//list common methods-- Transactions
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	
	public void transfer(String towhere, double amount) {
		balance = balance - amount;
		System.out.println("Transferring $" + amount + "to " + towhere);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your Balance is now $" + balance);
	}
	
	public void showInfo() {
		System.out.println("Name: " + name + 
				"\nAccount Number: "+ accountNumber + 
				 "\nBalance:"   +balance +
				 "\nRate: " + rate +  "%");
		
		
	}

}