package Coding;
import java.util.Scanner;
public class primenoinrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int s1,s2,i,j,flag=0;
System.out.println("enter the lower limit: ");
s1=s.nextInt();
System.out.println("enter the upper limit: ");
s2=s.nextInt();
for(i=s1;i<=s2;i++)
	
{
	for(j=2;j<i;j++)
	{
		if(i%j==0)
		{
			flag=0;
			break;
		}
		else
		{
			flag=1;
		}
		
	}
	if(flag==1)
	{
		System.out.printf(
	}
}
	}

}
