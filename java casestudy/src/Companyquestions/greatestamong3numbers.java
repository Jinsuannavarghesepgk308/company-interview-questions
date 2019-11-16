package Companyquestions;
import java.util.Scanner;
public class greatestamong3numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=s.nextInt();
		System.out.println("Enter the second number");
		int num2=s.nextInt();
		System.out.println("Enter the third number");
		int num3=s.nextInt();
if(num1>num2 && num1>num3)
{
	System.out.println("First number is the largest number");
}
else if(num2>num1 && num2>num3)
{
	System.out.println("Second number is the largest number");
}
else if(num3>num1 && num3>num1)
{
	System.out.println("Third number is the largest number");
}
else
	System.out.println("Entered number are not distinct");
	}

}
