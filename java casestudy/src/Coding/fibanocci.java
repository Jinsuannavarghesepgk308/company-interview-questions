package Coding;
import java.util.Scanner;
public class fibanocci {
	public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=0,b=1,c=0;
System.out.printf("%d %d",a,b);
for(int i=1;i<n-1;i++)
{
	c=a+b;
	System.out.printf("%d ",c); 
	a=b;
	b=c;
	
}
}
}
