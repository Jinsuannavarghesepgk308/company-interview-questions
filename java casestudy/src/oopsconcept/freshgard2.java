
package oopsconcept;
import java.util.Scanner;
public class freshgard2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		    Scanner s=new Scanner(System.in);
		    String name=s.next();
		    String color=s.next();
		    
		    float cc=s.nextFloat();
		    int speed=s.nextInt();
		    double price=s.nextDouble();
		    int manufactureDiscount=s.nextInt();
		    int weight=s.nextInt();
		    Bike b=new Bike();
		    SportBike sb=new SportBike();
		    Scooter sc=new Scooter();
		    b.details();
		    sb.details();
		    sc.details();
		  }
		}
		class Bike {
		  void details()
		  {
		    
		    System.out.println("Name of the bike : "+name);
		    System.out.println("Color of the bike : "+color);
		    System.out.println("Capacity(CC) of the bike : "+cc);
		    System.out.println("Speed of the bike : "+speed);
		    System.out.println("Price of the bike : "+price);
		    System.out.println("Discount of the bike : "+manufactureDiscount);
		    
		  }
		}
		class Scooter extends Bike {
		  void details(String name,String color,float cc,int speed,double price,int manufactureDiscount,int weight);
		  {
		    System.out.println("Enter the details of Scooter");
		    System.out.println("Name of the Scooter : "+name);
		    System.out.println("Color of the Scooter : "+color);
		    System.out.println("Capacity(CC)of the Scooter : "+cc);
		    System.out.println("Speed of the Scooter : "+speed);
		    System.out.println("Price of the Scooter : "+price);
		    System.out.println("Discount of the Scooter : "+manufactureDiscount);
		    System.out.println("Weight of the Scooter : "+weight);
		  }
		}
		class SportBike extends Bike {
		  System.out.println("Sports Bike:");
		  System.out.println("Name : "+name);
		    System.out.println("Color : "+color);
		    System.out.println("Capacity : "+cc);
		    System.out.println("Speed : "+speed);
		    System.out.println("Price : "+price);
		    System.out.println("Manufacturer Discount : "+manufactureDiscount);
		  float sportsbike=(float)price-manufactureDiscount);
		   System.out.println("Sports Bike price is : "+sportsbike); 
		  }
		}
	}

}
