package Companyquestions;
import java.util.Scanner;

public class nprimenumber {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int i, number = 1, count; 
		
		System.out.println("enter the number");
		int n=s.nextInt();
		while(number <= n)
		{
			count = 0;
			i = 2;
		    while(i <= number/2 )
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    	i++;
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }
		    number++;
		}
	}
}