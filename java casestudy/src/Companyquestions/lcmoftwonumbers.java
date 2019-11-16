package Companyquestions;

import java.util.Scanner;

public class lcmoftwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the first number");
int n1=s.nextInt();
System.out.println("enter the second number");
int n2=s.nextInt();
int max,lcm=0;
max=(n1>n2)?n1:n2;
for(int i=max;i<n1*n2;i++)
{
if(i%n1==0 && i%n2==0)
{
lcm=i;
break;
}
}
System.out.println(lcm);

}

}
