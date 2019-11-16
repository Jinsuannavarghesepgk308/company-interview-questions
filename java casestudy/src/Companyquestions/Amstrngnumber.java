package Companyquestions;
import java.util.Scanner;
public class Amstrngnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int a=s.nextInt();
int b=a;
int c=a;
int sum=0,r,count=0;
while(c!=0)
{
	count++;
	c=c/10;
	
}
while(a!=0)
{
	r=a%10;
	sum=(int) ((int)(double)sum+Math.pow(r, count));
	a=a/10;
}
if(sum==b)

{
	System.out.println("The given number is an Amstrong number ");
}
else
{
	System.out.println("The given number is not an Amstrong number ");
}
	}

}
