package Companyquestions;
import java.util.Scanner;
public class tempincentigrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the temperature in centigrade");
float cen=s.nextFloat();
double fahren;
fahren=(1.8*cen)+32;
System.out.println("Equivalent temperature in fahrenheit is:"+fahren);
	}

}
