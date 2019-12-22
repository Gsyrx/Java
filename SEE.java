//Q1(a) Fibonnaci Series Without Recursion
package p1;

public class fib_without_rec {
	public static void main(String args[]) {
		int n1=0,n2=1,n3,count=20;
		System.out.print(n1 + " " + n2 + " ");
		for(int i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(n3 + " ");
			n1=n2;
			n2=n3;
		}
	}

}




//Q1(b)Fibonnaci Series With Recursion
package p1;
import java.util.Scanner;

public class fib_with_rec {
	static int fib(int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else 
			return (fib(n-1)+fib(n-2));
	}
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms : ");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print(fib(i) + " ");
		}
	}

}







//Q1(c) Prime or not
package p1;
import java.util.Scanner;

public class Prime {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		n = sc.nextInt();
		boolean IsPrime = true;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				IsPrime = false;
				break;
			}
		}
		if(IsPrime)
		{
			System.out.println(n+ " is a prime number");
		}
		else
			System.out.println(n + " is not a prime number ");
		
	}

}






//Q1(d) Bubble sort
package p1;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String args[]) {
		int [] arr = new int[10];
		int n,i,j,temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		n = sc.nextInt();
		System.out.println("Enter the elements :");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("The sorted list is : ");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}
	
}






//Q2 Account Balance
package p2;
import java.util.Scanner;
public class UserDetails {
	int ac_no,ph_no,balance;
	String name;
	void getInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name :");
		name = sc.nextLine();
		System.out.print("Enter account number :");
		ac_no = sc.nextInt();
		System.out.print("Enter phone number :");
		ph_no = sc.nextInt();
		System.out.print("Enter balance :");
		balance = sc.nextInt();
	}
	void deposit(int n)

	{
		balance+=n;
		System.out.print("The new balance : " + balance);
	}
	void withdraw(int n)
	{
		if((balance-n)<0)
		{
			System.out.print("Insufficient balance");
		}
		else
		{
			balance-=n;
			System.out.print("The new balance : " + balance);
		}
	}
	void print()
	{
		System.out.println("Name : " + name);
		System.out.println("Account number : " + ac_no);
		System.out.println("Phone number : " + ph_no);
		System.out.println("Balance : " + balance);
	}
}



package p2;
import java.util.Scanner;

public class Account {
	public static void main(String args[])
	{
		UserDetails userdetails = new UserDetails();
		userdetails.getInput();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int choice,n;
			System.out.println("\n1.Deposit\n2.Withdraw\n3.Display\n4.Exit\n");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: System.out.print("Enter the amount to be deposited : ");
					n = sc.nextInt();
					userdetails.deposit(n);
					break;
			case 2: System.out.print("Enter the amount to be withdrawn : ");
					n = sc.nextInt();
					userdetails.withdraw(n);
					break;
			case 3: userdetails.print();
					break;
			case 4: System.exit(0);
			default: System.out.println("Wrong code entered !!");
			}
		}
	}
}





//Q3 Stack
package p3;
import java.util.Scanner;

public class Stack {
	int stack[],top;
	Stack(){
		stack = new int[20];
		top = -1;
	}
	void push(int x)
	{
		if(top==19)
		{
			System.out.println("The stack is full");
		}
		else 
			stack[++top]=x;
		System.out.print("Pushed successfully");
	}
	int pop()
	{
		if(top==-1)
		{
			System.out.println("The stack is empty");
			return 0;
		}
		else
			return stack[top--];
	}
	void display()
	{
		if(top==-1)
		{
			System.out.println("The stack is empty");
		}
		else
		{
			for(int i=top;i>=0;--i)
			{
				System.out.println(stack[i]);
			}
		}
	}
	public static void main(String args[])
	{
		Stack s = new Stack();
		int x;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int choice;
			System.out.println("\n1.Push\n2.Pop\n3.Display\n4.Exit");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Enter the number to be pushed : ");
					x = sc.nextInt();
					s.push(x);
					break;
			case 2: System.out.println("The popped element is " + s.pop());
					break;
			case 3: s.display();
					break;
			case 4: System.exit(0);
			default: System.out.println("Wrong code entered !!");
			}
		}
	}

}




//Q4 Complex
package p4;

public class Complex {
	float real;
	float imag;
	Complex(float real,float imag){
		this.real = real;
		this.imag = imag;
	}
	static Complex addcomplex(Complex c1, Complex c2) {
		return new Complex((c1.real + c2.real),(c1.imag + c2.imag));
	}
	static Complex subcomplex(Complex c1, Complex c2) {
		return new Complex((c1.real - c2.real),(c1.imag - c2.imag));
	}
	static Complex mulcomplex(Complex c1, Complex c2) {
		return new Complex((c1.real*c2.real - c1.imag*c2.imag),(c1.real*c2.imag + c1.imag*c2.real));
	}
	public String toString()
	{
		return real + " + " + imag + " i ";
	}
	

}



package p4;

public class DemoComplex {
	public static void main(String args[])
	{
		Complex c1 = new Complex(5,3);
		Complex c2 = new Complex(2,1);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("Addition = " + Complex.addcomplex(c1, c2));
		System.out.println("Substraction = " + Complex.subcomplex(c1, c2));
		System.out.println("Multiplication = " + Complex.mulcomplex(c1, c2));
		
	}

}






//Q5 Matrix Multiplication
package p5;
import java.util.Scanner;

public class mat_mul {
	public int matA[][],matB[][],matC[][];
	mat_mul()
	{
		matA= new int[3][3];
		matB= new int[3][3];
		matC= new int[3][3];
	}
	int [][] getMatrix(int m[][])
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				m[i][j] = sc.nextInt();
			}
		}
		return m;
	}
	int [][] multiply(int m[][],int n[][],int c[][])
	{
		int i,j,k,sum=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				for(k=0;k<3;k++)
				{
					sum+=m[i][k]+n[k][j];
				}
				c[i][j]=sum;
				sum=0;
			}
			
		}
		return c;
	}
	public static void main(String args[])
	{
		mat_mul matrix = new mat_mul();
		System.out.println("Enter first 3 x 3 matrix");
		matrix.matA = matrix.getMatrix(matrix.matA);
		System.out.println("Enter second 3 x 3 matrix");
		matrix.matB = matrix.getMatrix(matrix.matB);
		matrix.matC = matrix.multiply(matrix.matA,matrix.matB,matrix.matC);
		System.out.println("The resultant matrix is ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix.matC[i][j]+ " ");
				
			}
			System.out.println();
		}
	}

}




//Q8 Circle
package p8;
import java.lang.Math;

public class Circle {
	double r;
	Circle(double r)
	{
		this.r=r;
	}
	double area()
	{
		return Math.PI *Math.pow(r, 2);
	}

}
class Sector extends Circle {
	double ang;
	Sector(double r,double ang)
	{
		super(r);
		this.ang=ang;
	}
	double area()
	{
		return 0.5 * Math.pow(r, 2) * ang ;
	}
}
class Segment extends Circle
{
	double h;
	Segment(double r,double h)
	{
		super(r);
		this.h=h;
	}
	double area()
	{
		return (double) Math.pow(r, 2)*((r-h)/r)-(r-h)*Math.pow(2*r*h-Math.pow(h, 2), 1/2);
	}
}



package p8;
import java.util.Scanner;

public class Compute {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of radius : ");
		double r = sc.nextDouble();
		Circle ob1 = new Circle(r);
		System.out.print("Enter the value of angle : ");
		double ang = sc.nextDouble();
		Sector ob2 = new Sector(r,ang);
		System.out.print("Enter the value of length : ");
		double l = sc.nextDouble();
		Segment ob3 = new Segment(r,l);
		System.out.println("Area of circle =  " + ob1.area());
		System.out.println("Area of sector =  " + ob2.area());
		System.out.println("Area of segment =  " + ob3.area());
	}

}




//Q9  Vehicle
package p9;
import java.util.Scanner;

abstract class Vehicle {
	Scanner sc = new Scanner(System.in);
	int year_of_manufacture;
	abstract void getdata();
	abstract void putdata();
	Vehicle()
	{
		year_of_manufacture = 0;
	}
}
class TwoWheeler extends Vehicle
{
	void getdata()
	{
		System.out.print("Enter the year of manufacture : ");
		year_of_manufacture = sc.nextInt();		
	}
	void putdata()
	{
		System.out.print("Year of manufacture =  " + year_of_manufacture );
	}
}
final class FourWheeler extends Vehicle
{
	void getdata()
	{
		System.out.print("Enter the year of manufacture : ");
		year_of_manufacture = sc.nextInt();		
	}
	void putdata()
	{
		System.out.print("Year of manufacture =  " + year_of_manufacture );
	}
}
class MyTwoWheeler extends TwoWheeler
{
	MyTwoWheeler()
	{
		super.getdata();
		super.putdata();
	}
}


package p9;

public class DemoVehicle {
	public static void main(String args[])
	{
		MyTwoWheeler ob = new MyTwoWheeler();
	}

}





//Q10  Faculty
package main;

public class Faculty {
	public String name;
	public String desination;
	public int age;
	public int yoe;
	public String joining_date;
	public String subject_handled;
}



package main;
import main.Faculty;

public interface Department {
	public void getdata(Faculty f);
	public void printdata(Faculty f);
}



package ISE;
import java.util.Scanner;
import main.Department;
import main.*;

public class ISE_Department implements Department{
	public void getdata(Faculty f)
	{
		Scanner sc = new Scanner(System.in);
		int tempAge;
		System.out.print("Enter name : ");
		f.name = sc.next();
		System.out.print("Enter age : ");
		tempAge = sc.nextInt();
		if(tempAge<=58)
		{
			f.age = tempAge;
		}
		else
			throw new java.lang.Error("Age exception");
		System.out.print("Enter desination : ");
		f.desination = sc.next();
		System.out.print("Enter year of experience : ");
		f.yoe = sc.nextInt();
		System.out.print("Enter joining date : ");
		f.joining_date = sc.next();
		System.out.print("Enter subject handled : ");
		f.subject_handled = sc.next();
		System.out.print("Data entered successfully !!");
	}
	public void printdata(Faculty f)
	{
		System.out.println("Name : "+f.name);
		System.out.println("Age : "+ f.age);
		System.out.println("Desination : "+f.desination);
		System.out.println("Year of experience : "+f.yoe);
		System.out.println("Joining date : "+f.joining_date);
		System.out.println("Subject handled : "+f.subject_handled);
	}
}



package main;
import java.util.Scanner;
import ISE.ISE_Department;


public class Main {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int count=0;
		Faculty f[]= new Faculty[10];
		ISE_Department ise = new ISE_Department();
		while(true)
		{
			System.out.println("\n1.Add new faculty record");
            System.out.println("2.List of experienced faculty");
            System.out.println("3.Exit");
            System.out.print("Enter choice: ");
            int n = sc.nextInt();
            switch(n)
            {
            case 1: f[count] = new Faculty();
            		ise.getdata(f[count]);
            		count++;
            		break;
            case 2: for(int i=0;i<n;i++) {
            	if(f[i]!=null)
            	{
            		if(f[i].yoe>=20)
            		{
            			ise.printdata(f[i]);
            		}
            	}
            }
            break;
            case 3: System.exit(0);
            default: System.out.println("Wrong code entered !!");
            }
		}
	}

}





// Q7  Person
package p7;

public class Person {
	String name;
	String edu;
	int yoe;
	Salary salary;
	int noOfLoans;
	float loanAmount;
	Person(String name,String edu,int yoe)
	{
		this.name=name;
		this.edu=edu;
		this.yoe=yoe;
	}
	void setLoan(int noOfLoans,float loanAmount)
	{
		this.noOfLoans=noOfLoans;
		this.loanAmount=loanAmount;
	}
	void setSalary(Salary salary)
	{
		this.salary=salary;
	}
	boolean isEligible()
	{
		if(yoe>5&&loanAmount<15000)
			return true;
		else
			return false;
	}
	boolean isEligiblePro()
	{
		if(yoe>15)
			return true;
		else
			return false;
	}
	public String toString()
	{
		return "\nName = " + name + "\nEducation = " + edu +"\nNet salary = "+ salary.netSalary
				+ "\nYear of experience = "+ yoe;
		
	}
}
class Salary
{
	float basic;
	float da;
	float hra;
	float netSalary;
	float grossSalary;
	float tax(float amount)
	{
		float salperYear = amount * 12;
		float taxAmount = 0;
		if(salperYear<500000)
			taxAmount = 20000;
		else if(salperYear<1000000)
			taxAmount=25000;
		else
			taxAmount = 30000;
		return taxAmount;
	}
	Salary(float basic,float da,float hra)
	{
		this.basic=basic;
		this.da=da;
		this.hra=hra;
		grossSalary = this.basic + this.basic * this.da/100 + this.basic * this.hra/100;
		float taxperMonth = tax(grossSalary)/12;
		netSalary = grossSalary - taxperMonth;
	}
}


package p7;

public class DemoPerson {
	public static void main(String args[])
	{
		Person person = new Person("Gaurav","MTech",10);
		person.setLoan(1,10000);
		person.setSalary(new Salary(50000,125,30));
		System.out.println("Person details are as : ");
		System.out.print(person);
		System.out.println("\nNo of loans = "+ person.noOfLoans + "\n"+ "Loan Amount = "+ person.loanAmount);
		System.out.println("Gross Salary =  "+ person.salary.grossSalary);
		System.out.println("Tax paid = "+ person.salary.tax(person.salary.grossSalary)/12);
		System.out.println("Eligiblity for loan ? "+person.isEligible());
		System.out.println("Eligiblity for promotion ? "+person.isEligiblePro());
	}
}




//Q6  String
package p6;

import java.util.Arrays;

public class Lib {
	public static final String extract(String str,int m,int n) 
	{
		return str.substring(n,m+n);
	}
	public static int countAWord(String str,String word)
	{
		String [] allWords = str.split(" ");
		int count = 0;
		for(String x: allWords)
		{
			if(x.equals(word))
				count++;
		}
		return count;
	}
	public static String reArrange(String str)
	{
		char[] strChars = str.toCharArray();
		Arrays.sort(strChars);
		return new String(strChars);
	}
}



package p6;

public class DemoLib {
	public static void main(String[] args)
	{
		String str = "Hello World";
		String str2 = "My car, My house, My dog, My horse, My children, My friend";
		System.out.println(Lib.extract(str,4,6));
		System.out.println(Lib.countAWord(str2,"My"));
		System.out.println(Lib.reArrange("OOPSwithJava"));
		str2 = str2.replace("My","Your");
		System.out.println(str2);
		String str3 = "hello";
		String str4 = "HELLO";
		System.out.println(str3.equalsIgnoreCase(str4));
		System.out.println(str.concat(str4));
	}

}





//Q12   List Queue
package p12;
import java.util.Scanner;
import java.util.ArrayList;
public class queue {
	ArrayList<String> alist = new ArrayList<>();
    void insert(String s)
    {
        alist.add(s);
    }
    void delete()
    {
        if (alist.isEmpty())
            System.out.println("UNDERFLOW");
        else {
            System.out.println("String deleted is " + alist.get(0));
            alist.remove(0);
        }
    }
    void display()
    {
        if (alist.isEmpty())
            System.out.println("UNDERFLOW");
        else
            System.out.println(alist);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        queue ob = new queue();
        int ch;
        while (true)
        {
            System.out.println("Press 1 to insert\nPress 2 to delete\nPress 3 to display\nPress 4 to exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1: System.out.println("Enter a string");
                        sc.nextLine();
                        ob.insert(sc.nextLine());
                        break;
                case 2: ob.delete();
                        break;
                case 3: ob.display();
                        break;
                case 4: System.exit(0);
                default:System.out.println("Incorrect choice");
            }
        }
    }

}



package p12;
import java.util.LinkedList;
import java.util.ListIterator;
public class LList {
	public static void main(String args[])
    {
        LinkedList<String> lst = new LinkedList<>();
        lst.add("Waqqas");
        lst.add("save");
        lst.addLast("Vinay");
        lst.addFirst("cut");
        lst.add(2, "Yash");
        lst.add("me");
        lst.add("Talmiz");
        System.out.println("Linked list : " + lst);
        ListIterator i = lst.listIterator();
        System.out.println("Names with length less than 5: ");
        while (i.hasNext())
        {
            String s = i.next().toString();
            if(s.length()<5)
                System.out.print(s+"  ");
        }
    }
}

