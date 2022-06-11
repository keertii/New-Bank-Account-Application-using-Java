package BankApp;

public class Savings extends Account {
	
	//list properties specific to savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	
	
	
		//constructor to initialise savings account properties
	public Savings(String name, String SSN, double initDeposit){
		super(name, SSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
		//System.out.println("Account Number: " + this.accountNumber);
		//System.out.println("New Savings Account");
		
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
		
	}
	
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		//System.out.println(safetyDepositBoxID);
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
		//list any methods specific to savings account 
	public void showInfo() {
		//System.out.println("Account Type: Savings Account\n");
		
		super.showInfo();
		System.out.println("Your Savings Account Feautures"+ 
							"\nSafety Deposit Box ID: " + safetyDepositBoxID +
								"\nSafety Deposit Box Key: " + 	safetyDepositBoxKey	);
		
	}
	

}