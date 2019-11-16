package Coding;
import java.util.Scanner;
public class nprimeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n,i,j,flag=0;
System.out.println("enter the limit: ");
n=s.nextInt();
for(i=2;i<n;i++)
{
	for(j=1;j<i;j++)
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
		System.out.println(i);
	}
}
	}

}
