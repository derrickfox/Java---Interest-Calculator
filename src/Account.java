/* Derrick Fox
 * CS 213 31015
 * Account.java HW8
 * March 25, 2014
 * Account Class
 * 
 * This is a class that creates methods for adding, subtracting, and reporting funds in a bank account. 
 * 
 */

import java.util.Date;
import java.util.Scanner;

public class Account {
	//Here we declare private instance variables
	private int accountNumber = 0;
	private double accountBalance = 0;
	private double interestRate = 0.045;
	private double interestTotal = 0;
	static double total = 0;
	private Date date;
	private String owner;
	
	//Here a default instance is created with no parameters
	public Account() {
		setDate();
		total = total + accountBalance;
	}
	//Here is a default instance with parameters
	public Account(String owner, double balance, int accNumber) {
		setOwner(owner);
		setAccountNumber(accNumber);
		setAccountBalance(balance);
		setDate();
		total = total + balance;
	}
	
	//Method that assigns an account number
	public void setAccountNumber(int newNumber) {
		accountNumber = newNumber;
	}
	
	//Method that assigns an initial account balance
	public void setAccountBalance(double newBalance) {
		accountBalance = newBalance;
	}
	
	//Method that sets the date for when an account was created
	public void setDate() {
		date = new Date();
	}
	
	//Method to withdraw money from account
	public void withdraw(double amount) {
		accountBalance = accountBalance - amount;
		total = total - amount;
	}
	
	//Method to add money to an account
	public void deposit(double amount) {
		accountBalance = accountBalance + amount;
		total = total + amount;
	}
	
	//Method to return account number to the user
	public int getAccountNumber() {
		return accountNumber;
	}
	
	//Method to return  account balance to the user
	public double getAccountBalance() {
		return accountBalance;
	}
	
	//Method to return interest rate to the user
	public double getInterestRate() {
		return interestRate; 
	}
	
	//Method to return date that account was created to the user
	public Date getDate() {
		return date;
	}
	
	//Method to return account balance to the user
	public double getTotal() {
		return total;
	}
	
	//Method to return the account of interest accured to the user
	public double getInterestTotal() {
		interestTotal = accountBalance * (interestRate / 12);
		return interestTotal;
	}
	
	public void setOwner(String name) {
		owner = name;
	}
	
	public String getOwner() {
		return owner;
	}
}
