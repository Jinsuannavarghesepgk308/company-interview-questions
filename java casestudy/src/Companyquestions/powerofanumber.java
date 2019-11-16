package Companyquestions;
import java.util.Scanner;
public class powerofanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the base value");
int base = s.nextInt();
System.out.println("enter the exponent value");
int exponent = s.nextInt();
int power = 1;


for(int i = 1; i <= exponent; i++) {
    power = power * base;
}
System.out.println("Result :"+power);
	}

}
