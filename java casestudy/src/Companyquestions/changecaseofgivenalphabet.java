package Companyquestions;
import java.util.Scanner;
public class changecaseofgivenalphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the character");
		char c = s.next().charAt(0);
		if(c>='a' && c<='z')
		{
		c= (char)((int)c-32);
		}
		else
		{
		c= (char)((int)c+32);
		}
		System.out.print(c);


		}

		}