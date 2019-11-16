package Companyquestions;
import java.util.Scanner;
public class hypotenuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
double side1,side2,hypotenuse;
System.out.println("enter a value of side1:");
side1=s.nextDouble();
System.out.println("enter a value of side2:");
side2=s.nextDouble();
hypotenuse=Math.sqrt(Math.pow(side1, 2)+(Math.pow(side2, 2)));
System.out.println("The length of the hypotenuse is :"+hypotenuse);
	}

}
