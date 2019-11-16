package Companyquestions;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int a=0,b=1;
System.out.printf("%d %d ", a,b);
for(int i=0;i<n;i++)
{
	int c=a+b;
	System.out.printf("%d ",c);
	a=b;
	b=c;
}
	}

}
