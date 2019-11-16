package Coding;
import java.util.Scanner;
public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int sum=0;
for(int i=1;i<n;i++)
{
	if(n%i==0)
	{
		sum=sum+i;
	}
				
	}
if(sum==n)
{
	System.out.println("the given number is perfect number");
}
else
{
	System.out.println("the given number is not a perfect number");
}
	}

}
