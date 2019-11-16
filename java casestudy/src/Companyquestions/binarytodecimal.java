package Companyquestions;
import java.util.Scanner;
public class binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the binary number");
		int bin=s.nextInt();
		int dec=0,r1,r2;
		
		int i=0;
		while(bin!=0)
		{
			r1=bin%10;
			dec=dec+(int)(r1*Math.pow(2, i));
			bin=bin/10;
			i++;
			
		}
		System.out.println("Decimal value is :"+dec);
		
	}

}
