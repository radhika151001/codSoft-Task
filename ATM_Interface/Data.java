package atm_Interface;

import java.util.Scanner;

public class Data {
int num1=0;
	
	Account a=new Account();
	Scanner s=new Scanner(System.in);
	
	public void login() {
		System.out.println("Enter Account Number:");
		int accountNumber=s.nextInt();
		a.setAccountNumber(accountNumber);
		while(accountNumber!=0) {
			accountNumber/=10;
			num1++;
		}
		if(num1!=8) {
			System.out.println("Please enter 8 digit Account Number");
			System.exit(0);
		}
		System.out.println("Enter Pin");
		int pin=s.nextInt();
		
		System.out.println("Enter Account Balance:");
		double accountBalance=s.nextDouble();
		if(accountBalance<1000) {
			System.out.println("Account Balance should be minimum 1000 rupees");
			System.exit(0);
		}
		a.setAccountBalance(accountBalance);
		System.out.println("\n=================Login Successful=================\n");
	}
	
	
	public void depositeMoney() {
		System.out.println("Enter Amount to Deposite:");
		double depositeAmount=s.nextDouble();
		if(depositeAmount<100 || depositeAmount>100000) {
			System.out.println("Deposite amount should be greater than 100 and less than 100000");
			System.exit(0);
		}
		else
		{
		double totalBalance=a.getAccountBalance()+ depositeAmount;
		System.out.println("Your total balance is:"+totalBalance);
		a.setAccountBalance(totalBalance);
		}
		System.out.println("=======================Transaction Successful=======================");
	}
	
	public void withdrawlMoney() {
		System.out.println("Enter Amount to Withdrawl:");
		double withdrawlAmount=s.nextDouble();
		
		if(withdrawlAmount> a.getAccountBalance()) {
			System.out.println("Withdrawl amount should be less than your balance");
			System.out.println("Your account balance is:"+a.getAccountBalance());
			System.exit(0);
		}
			else if(withdrawlAmount<500 || withdrawlAmount>20000) {
				System.out.println("Withdrawl amount should be greater than 500 and less than 20000");
			System.exit(0);
		}
		
		double remainingAmount=a.getAccountBalance()-withdrawlAmount;
		if(remainingAmount<1000) {
			System.out.println("Remaining account balance should be greater than 1000");
			System.out.println("Your account balance is:"+a.getAccountBalance());
			System.exit(0);
		}
		System.out.println("Your remaining balance is:"+remainingAmount);
		a.setAccountBalance(remainingAmount);
		System.out.println("=======================Transaction Successful=======================");
		
	}
	
	public void balanceCheck() {
		System.out.println("Your Account Balance is:"+a.getAccountBalance());
	}


}
