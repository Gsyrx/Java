package prg2;
import java.util.Scanner;

public class UserDetails {
		int accno, phone_no, balance_amt;
		String name;
		
		void getInput()
		{
			Scanner scanner =  new Scanner(System.in);
			System.out.println("Enter the user details");
			System.out.print("Enter Name: ");
			name = scanner.nextLine();
			System.out.print("Enter account number: ");
			accno= scanner.nextInt();
			System.out.print("Enter phone number: ");
			phone_no = scanner.nextInt();
			System.out.print("Enter balance: ");
			balance_amt = scanner.nextInt();
		}

		void deposit( int n)
		{
			balance_amt+=n;
			System.out.println("The new balance is: " + balance_amt);
		}
		
		void withdraw(int n)
		{
			if(balance_amt-n <0)
			{
				System.out.println("Insufficient balance");
			}
			
			else
			{
				balance_amt-=n;		
				System.out.println("The new balance is: " + balance_amt);
			}
		}
		
		void print()
		{
			System.out.println("Name: " + name);
			System.out.println("Account number: " + accno);
			System.out.println("Phone number: " + phone_no);
			System.out.println("Balance: " + balance_amt);
		}
	}







package prg2;
import java.util.Scanner;

public class AccountClass {
	public static void main(String [] args)
	{
		UserDetails userDetails = new UserDetails();
		userDetails.getInput();
		Scanner sc = new Scanner(System.in);
		
		int choice;
		while(true)
		{
			int n;
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Display details");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice)
			{
				case 1:
					System.out.print("Enter the amount to be deposited: ");
					n = sc.nextInt();
					userDetails.deposit(n);
					break;
				case 2:
					System.out.print("Enter the amount to be withdrawn: ");
					n = sc.nextInt();
					userDetails.withdraw(n);
					break;
				case 3:
					userDetails.print();
					break;
				
				case 4:
					System.exit(0);
					break;
					
				default:
					System.out.println("Incorrect choice");
					
			}
		}
	}
	

}
