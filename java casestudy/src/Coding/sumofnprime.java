package Coding;
import java.util.Scanner;
public class sumofnprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,i,j,flag=0;
		System.out.println("enter the limit: ");
		n=s.nextInt();
		for(i=0;i<=n;i++)
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
				