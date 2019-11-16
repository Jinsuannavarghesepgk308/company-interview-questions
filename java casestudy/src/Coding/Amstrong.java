package Coding;
import java.util.Scanner;
public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int r,result=0;
		int originalnum=num;
		while(originalnum!=0)
		{
			r=originalnum%10;
			result+=Math.pow(r, 3);
			originalnum /=10;
		}
		if(result==num)
		{
			System.out.println("Amstrong number");
		}
		else
		{
			System.out.println("Not an amstrong number");
		}

	}

}
