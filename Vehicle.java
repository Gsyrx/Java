package P2;

	import java.util.Scanner;
	abstract class Vehicle
	{
	    Scanner sc = new Scanner(System.in);
	    int year_of_manufacture;
	    abstract void getData();
	    abstract void putData();
	    Vehicle()
	    {
	        year_of_manufacture=0;
	    }
	}




package P2;

	class TwoWheeler extends Vehicle
	{
	    void getData()
	    {
	        System.out.println("Enter the year of manufacture :- ");
	        year_of_manufacture = sc.nextInt();
	    }
	    void putData()
	    {
	        System.out.println("Year of manufacture :->  "+year_of_manufacture);
	    }
	}




package P2;

	final class FourWheeler extends Vehicle
	{
	    void getData()
	    {
	        System.out.println("Enter the year of manufacture");
	        year_of_manufacture = sc.nextInt();
	    }
	    void putData()
	    {
	        System.out.println("Year of manufacture : "+year_of_manufacture);
	    }
	}




package P2;
	class MyTwoWheeler extends TwoWheeler
	{
	    {
	        super.getData();
	        super.putData();
	    }
	}




package P2;

public class Main {

	    public static void main(String args[])
	    {
	        MyTwoWheeler ob = new MyTwoWheeler();
	    }
	}
