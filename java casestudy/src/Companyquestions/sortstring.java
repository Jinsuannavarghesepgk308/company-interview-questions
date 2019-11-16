package Companyquestions;

import java.util.Scanner;

public class sortstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		int i,j;
		char x;
		char c[]=str.toCharArray();
		int n=c.length;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(c[j]<c[i])
				{
					x=c[i];
					c[i]=c[j];
					c[j]=x;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(c[i]);
		}
	}
}