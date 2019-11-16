package Companyquestions;
import java.util.Scanner;
public class decimaltooctalnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int dec= s.nextInt();
		int r,oct=0,i=1;
		while(dec!=0)
		{
		r = dec%8;
		oct = oct+r*i;
		dec=dec/8;
		i=i*10;
		}
		System.out.println(oct);

		}

		}
