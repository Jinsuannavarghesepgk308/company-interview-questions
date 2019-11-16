package Companyquestions;
import java.util.Scanner;
public class reversefibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i;
		System.out.println("enter the number");
		
		int n=s.nextInt();
		int a[]=new int[n];
		a[0]=0;
		a[1]=1;
		for(i=2;i<n;i++)
		{
			a[i]=a[i-1] + a[i-2];
		}
		for(int j=n-1;j>=0;j--)
		{
			System.out.printf("%d ",a[j]);
		}
		

	}

}
