package com.worksheet;

public class SavingsBalance {
	static double annualInterestRate;
    double balance;
	
	 public SavingsBalance(int balance) {
			this.balance=balance; 
		 }
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}


	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsBalance.annualInterestRate = annualInterestRate;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
    
	public void calculateMonthlyInterest()
	{
		double calculateMonthlyInterest = ((balance * annualInterestRate)/12);
		balance=calculateMonthlyInterest + balance;
	}
	public void showBalance() {
     System.out.println(balance);
	}
    
	
	public static void main(String[] args) {
	
	 SavingsBalance s1 = new SavingsBalance(100);
	 SavingsBalance s2 = new SavingsBalance(200);
			
	 s1.showBalance();
	 s2.showBalance();
	 
	 SavingsBalance.setAnnualInterestRate(4);
	 s1.calculateMonthlyInterest();
	 s2.calculateMonthlyInterest();
	 
	 s1.showBalance();
	 s2.showBalance();
	 
	 SavingsBalance.setAnnualInterestRate(5);
	 s1.calculateMonthlyInterest();
	 s2.calculateMonthlyInterest();
	 
	 s1.showBalance();
	 s2.showBalance();
}
}
