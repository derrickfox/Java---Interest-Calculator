/* Derrick Fox
 * CS 213 31015
 * Account.java HW8
 * March 25, 2014
 * Account Class Test
 * 
 * This is a test application to test that the Account class was created correctly.
 * 
 */
public class testAccount {
	public static void main(String[] args) {
		//Two test accounts are created
		Account account1 = new Account(null, 1122, 20000);
		Account account2 = new Account(null, 1123, 40000);
		
		//Withdraw method is tested
		account1.withdraw(2500);
		account2.withdraw(500);
		
		//Deposit method is tested
		account1.deposit(3000);
		account2.deposit(2000);
		
		//"get" methods are tested
		System.out.println("Account 1:");
		System.out.println("	Balance: $"+account1.getAccountBalance());
		System.out.println("	Account Number: "+account1.getAccountNumber());
		System.out.println("	Interest: $"+account1.getInterestTotal());
		System.out.println("	Created on: "+account1.getDate()+"\n");
		
		System.out.println("Account 2:");
		System.out.println("	Balance: $"+account2.getAccountBalance());
		System.out.println("	Account Number: "+account2.getAccountNumber());
		System.out.println("	Interest: $"+account2.getInterestTotal());
		System.out.println("	Created on: "+account2.getDate()+"\n");
		
		System.out.println("Total of all accounts is $"+Account.total);
	}
}
