package Companyquestions;
import java.util.Scanner;
public class sumofallprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int count,sum=0;
		System.out.println("Enter the lower limit");
		int a=s.nextInt();
		System.out.println("Enter the upper limit");
		int b=s.nextInt();
		int i;
		for(i=a;i<=b;i++) {
		count=0;
		for(int j=2;j<=i/2;j++)
		{
		if(i%j==0)
		{
		count++;
		break;
		}

		}
		if(count==0 && i!=1)
		{
		sum=sum+i;
		}
		}
		System.out.println(sum);


		}
		


	}


