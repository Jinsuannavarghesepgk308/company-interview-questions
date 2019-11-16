package Companyquestions;
import java.util.Scanner;
public class simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the principal");
double princi=s.nextDouble();
System.out.println("enter the rate of interest");
double rate=s.nextDouble();
System.out.println("enter the time period");
double time=s.nextDouble();
double simple=(princi*rate*time)/100;
System.out.println(simple);
	}

}
