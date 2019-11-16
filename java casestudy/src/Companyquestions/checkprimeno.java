package Companyquestions;
import java.util.Scanner;
public class checkprimeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int count=0;
System.out.println("enter the number");
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
	if(n%i==0)
	{
		count++;
	}
}
	if(count==2)
	{
		
	System.out.println("prime number");

	}

	
	else
	{
		System.out.println("not a prime number");
	}
}
	}


