package Companyquestions;

import java.util.Scanner;

public class gcdoftwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number");
		int n1=s.nextInt();
		System.out.println("enter the second number");
		int n2=s.nextInt();
		int min,hcf=0;
		min=(n1<n2)?n1:n2;
		for(int i=min;i>0;i--)
		{
		if(n1%i==0 && n2%i==0)
		{
		hcf=i;
		break;
		}
		}
		System.out.println(hcf);

		}

		

	}


