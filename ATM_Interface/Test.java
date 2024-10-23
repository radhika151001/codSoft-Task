package atm_Interface;

import java.util.Scanner;

public class Test {
	
public static void main(String[] args) {
		
		System.out.println("------------------------------ATM Interface------------------------------");
		
		Data d=new Data();
		Scanner s=new Scanner(System.in);
		
		while(true) {
			System.out.println("\n\nEnter Your Choice\n1.Login\n2.Deposite Money\n3.Withdrawl Money\n4.Check Balance\n\n");
			int ch=s.nextInt();
			switch (ch) {
			case 1:
				d.login();
				break;
			case 2:
				d.depositeMoney();
				break;
			case 3:
				d. withdrawlMoney();
				break;
			case 4:
				d. balanceCheck();
				break;
			default:
				System.out.println("Please Enter Valid option");
				System.exit(0);
				break;
				
				
			}
		}
	}

}
