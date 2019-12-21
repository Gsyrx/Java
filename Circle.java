package P1;
import java.lang.Math;

public class Circle {
	double r;
	Circle(double r){
		this.r=r;
	}
	double area() {
		return Math.PI * Math.pow(r, 2);
	}

}
class Sector extends Circle{
	double ang;
	Sector(double r,double ang){
		super(r);
		this.ang=ang;
	}
	double area() {
		return 0.5 * Math.pow(r, 2) * ang ;
	}
}
class Segment extends Circle{
	double h;
	Segment(double r,double h){
		super(r);
		this.h=h;
	}
	double area() {
		return (double) Math.pow(r,2)* Math.pow(((r-h)/r)-((r-h) * (2*r*h-Math.pow(h,2))),1/2);
	}
}



package P1;
import java.util.Scanner;

public class compute {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the value of radius:- ");
		double r =  sc.nextDouble();
		Circle ob1 = new Circle(r);
		System.out.println("\nEnter the angle of sector :- ");
		double ang = sc.nextDouble();
		Sector ob2 = new Sector(r,ang);
		System.out.println("\nEnter the length of a segment :- ");
		double l = sc.nextDouble();
		Segment ob3 = new Segment(r,l);
		System.out.println("Area of circle:- "+ob1.area());
		System.out.println("Area of sector :- "+ob2.area());
		System.out.println("Area of segment :- "+ob3.area());
	}

}
