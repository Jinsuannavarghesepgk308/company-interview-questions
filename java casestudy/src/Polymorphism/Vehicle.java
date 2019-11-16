package Polymorphism;
import java.util.Scanner;


public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
Car r=new Car();
Bike t=new Bike();

switch(n){
	case 1:
		System.out.println("Enter the details of car");
		System.out.println("Enter the color");
		String a=s.next();
		System.out.println("Enter the maximum speed");
		int b=s.nextInt();
		System.out.println("Enter the number of seats");
		int c=s.nextInt();
		System.out.println("Enter the number of wheels");
		int d=s.nextInt();
		
		
		System.out.println("Enter the status of diskbreak(true/false)");
		String e=s.next();
		r.details( a, b, c, d, e);
		break;
	case 2:
        System.out.println("Enter the details of bike");
		System.out.println("Enter the color");
		String a1=s.next();
		System.out.println("Enter the maximum speed");
		int b1=s.nextInt();
		System.out.println("Enter the number of seats");
		int c1=s.nextInt();
		System.out.println("Enter the number of wheels");
		int d1=s.nextInt();
		System.out.println("Enter the number of doors");
		int f1=s.nextInt();
		System.out.println("Enter the status of diskbreak(true/false)");
		String e1=s.next();
		t.details( a1, b1, c1, d1, f1,e1);
		break;
		default:
			System.out.println("Invalid Input");
}

}
}
