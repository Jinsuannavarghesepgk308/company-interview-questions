package Companyquestions;
import java.util.Scanner;
public class strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int fact,strong=0;
		System.out.println("Enter a number");
		int n=s.nextInt();
		int num=n;
		while(n!=0)
		{
			fact=1;
			int t=n%10;
			for(int i=1;i<=t;i++)
			{
				fact=fact*i;
			}
			strong=strong+fact;
			n=n/10;
		}
		if(num==strong)
			System.out.println("The given number is strong number");
		else
			System.out.println("The given number is not a strong number");
	}

}
