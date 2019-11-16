package Companyquestions;
import java.util.Scanner;
public class stringrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str= s.next();
		String rev= stringrev(str);
		System.out.println("The reverse string is "+rev);

		}

		private static String stringrev(String str) {
		// TODO Auto-generated method stub
		if(str.isEmpty())
		return str;
		return stringrev(str.substring(1))+str.charAt(0);

		}

		}

	


