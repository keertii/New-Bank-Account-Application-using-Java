package BankApp;


public interface IntrestRate {

	//write a method that returns the base rate
	default double getBaseRate() {  //An API 
		return 2.5;
	}
}