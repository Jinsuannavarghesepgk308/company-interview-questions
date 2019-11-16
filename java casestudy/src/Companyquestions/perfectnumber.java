package Companyquestions;
import java.util.Scanner;
public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int sum=0,n;
System.out.println("enter the number");
n=s.nextInt();
int a=n;
for(int i=0;i<n;i++)
{
	if(a%i==0)
	{
		sum=sum+i;
		
	}
	
}
if(sum==a)
{
	System.out.println("The given number is a perfect number");
}
else
{
	System.out.println("The given number is a perfect number");
}
	}

}
