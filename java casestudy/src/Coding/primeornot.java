
package Coding;

import java.util.Scanner;

public class primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=s.nextInt();
		int i,count=1;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.print("This is a prime number");
		}
		else
		{
			System.out.print("This is not a prime number");
		}
				

	}

}
