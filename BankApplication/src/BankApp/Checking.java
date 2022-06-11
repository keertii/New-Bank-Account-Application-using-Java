package BankApp;

public class Checking extends Account {
	
	//list properties specific to checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	
	
	//constructor to initialise checking account properties
	public Checking(String name, String SSN, double initDeposit){
		super(name, SSN, initDeposit);
		accountNumber = "2" + accountNumber;
		//System.out.println("Account Number: " + this.accountNumber);
		//System.out.println("New Checking Account");
		setDebitCard();
	
	}
	@Override 
	public void setRate() {
		//System.out.println("Implement Rate for Checking");
		rate = getBaseRate() * 0.15;
	}
	
	//list any methods specific to checking account 
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
		//System.out.println("DebitCard Number: " + this.debitCardNumber);
		//System.out.println("DebitCard PIN: " + this.debitCardPin);
		
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Feautres: " +
							"\nDebitCard Number: " + debitCardNumber +
							"\nDebitCard PIN: " + debitCardPin );
		
	}

}