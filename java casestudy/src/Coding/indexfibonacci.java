package Coding;
import java.util.Scanner;
public class indexfibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i=0,a=0,b=1,i1=0;
if(i==1)
{
	System.out.println("The value at i =1");
}
else
{
	for(int j=2;j<n;j++)
	{
		i=a+b;
		a=b;
		b=i;
		System.out.printf("%d ",i);
	}
}
	
	}

}
