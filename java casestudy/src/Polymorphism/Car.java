package Polymorphism;

public class Car {
public void details(String a,int b,int c,int d,String e)
{
	System.out.println("Color" +a);
	System.out.println("Maximum speed" +b);
	System.out.println("Number of seats" +c);
	System.out.println("Number of wheels" +d);
	
	System.out.println("Enter the status of diskbreak(true/false)" +e);
	
	

}
public class Bike extends Car {
	
	public void details(String a1,int b1,int c1,int d1,int f1,String e1)
	{
		System.out.println("Color" +a1);
		System.out.println("Maximum speed" +b1);
		System.out.println("Number of seats" +c1);
		System.out.println("Number of wheels" +d1);
		System.out.println("Number of doors" +f1);
		System.out.println("Enter the status of diskbreak(true/false)" +e1);
		
		
		

	}

	

	}



}