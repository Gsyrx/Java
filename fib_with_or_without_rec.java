package prg1;
import java.util.Scanner;

public class fib_without_rec {
	public static void main(String args[])  
	{    
	 int n1=0,n2=1,n3,i,count=10;    
	 System.out.print(n1+" "+n2);   
	    
	 for(i=2;i<count;++i)    
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 }    
	}
}


package prg1;
import java.util.Scanner;

public class fib_with_rec {

		static int fibonacci(int n)
		{
			if(n==0)
				return 0;
			else if (n==1)
				return 1;
			else
				return (fibonacci(n-1) + fibonacci(n-2));
		}
		
		public static void main(String [] args)
		{
			int n,i;
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter the number of terms: ");
			n=scanner.nextInt();
			for(i=0;i<n;i++)
			{
				System.out.print(fibonacci(i) + " ");
			}
			System.out.println("");
			
		}	
	}


