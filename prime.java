package prg1;
import java.util.Scanner;



public class Prime {

	
		public static void main(String args[])
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the number: ");
			int x= scanner.nextInt();

			boolean isPrime=true;

			for(int i=2;i<=x/2;i++)
			{
				if(x%i==0)
				{
					isPrime=false;
					break;
				}
			}

			if(isPrime)
				System.out.println("The given number is a prime number\n");

			else
				System.out.println("The given number is not a prime number\n");
		}
	}
