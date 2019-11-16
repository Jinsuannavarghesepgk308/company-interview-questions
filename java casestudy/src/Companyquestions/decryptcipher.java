package Companyquestions;
import java.util.Scanner;
public class decryptcipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);

		System.out.println("enter the character");
		char a=s.next().charAt(0);
		System.out.println("enter the number");
		int b=s.nextInt();
		int c=(int)a;
		int d=c-b;
		System.out.println((char)d);
		    }
		}

	


