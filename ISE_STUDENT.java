package main;

public class Faculty {
	public String name;
	public String designation;
	public int age;
	public int yoe;
	public String joining_date;
	public String subject_handled;

}





package main;
import main.Faculty;

public interface Department {
	public void readdata(Faculty f);
	public void printdata(Faculty f);
}





package ISE;
import java.util.Scanner;
import main.Department;
import main.*;

public class ISE_Department implements Department{


	public void readdata(Faculty f) {
		int tempAge;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter name :- ");
		f.name=sc.next();
		System.out.println("\nEnter age :- ");
		tempAge=sc.nextInt();
		if(tempAge<=58) {
			f.age=tempAge;
		}
		else {
			throw new java.lang.Error("Age exception");
		}
		System.out.println("\nEnter Designation :- ");
		f.designation=sc.next();
		System.out.println("\nEnter year of experience :- ");
		f.yoe=sc.nextInt();
		System.out.println("\nEnter joining date :- ");
		f.joining_date=sc.next();
        System.out.print("\nEnter subjects handled :- ");
        f.subject_handled = sc.next();
        System.out.print("\nData entered successfully\n");
    }
	 public void printdata(Faculty f) {
	        System.out.print("\nName :- " + f.name);
	        System.out.print("\nAge :- " + f.age);
	        System.out.print("\nDesignation :- " + f.designation);
	        System.out.print("\nYears of experience :- " + f.yoe);
	        System.out.print("\nJoining date :- " + f.joining_date);
	        System.out.println("\nSubjects handled :- " + f.subject_handled);
	    }
}





package main;


import java.util.Scanner;

import ISE.ISE_Department;
import main.Faculty;

public class MainClass {

    public static void main(String[] args) {

        int n,count=0; 
        Faculty f[] = new Faculty[10]; 
        ISE_Department ise = new ISE_Department();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add new faculty record");
            System.out.println("\n2 List of experienced faculty");
            System.out.println("\n3. Exit");
            System.out.print("Enter choice: ");
            n = sc.nextInt();

            switch (n) {
            case 1:
                f[count] = new Faculty();
                ise.readdata(f[count]); 
                count++;
                break;

            case 2:
                for (int i = 0; i < count; i++) {
                    if (f[i] != null) {
                        if (f[i].yoe >= 20) {
                            ise.printdata(f[i]);
                        }
                    }
                }
                break;

            case 3:
                System.exit(0);

            default:
                System.out.print("Wrong choice\n");
            }
        }
    }
}

