package Companyquestions;

import java.util.Scanner;

public class secondgreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number");
int n1=s.nextInt();
System.out.println("Enter the second number");
int n2=s.nextInt();
System.out.println("Enter the third number");
int n3=s.nextInt();
if(n1>n2 && n1<n3)
{
	System.out.println("Second greatest number is: "+n1);
}
else if(n2<n3)
{
	System.out.println("Second greatest number is: "+n2);
}
else
{
	System.out.println("Second greatest number is: "+n3);
}
	}
}
