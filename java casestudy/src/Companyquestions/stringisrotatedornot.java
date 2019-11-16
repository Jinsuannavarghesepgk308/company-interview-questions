package Companyquestions;
import java.util.Scanner;
public class stringisrotatedornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first string");
		String str1=s.nextLine();
		System.out.println("enter the second string");
		String str2=s.nextLine();
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Secong string is not a rotation of first string");
		}
		else {
			str1=str1.concat(str1);
			if(str1.indexOf(str2)!=0)
				System.out.println("Secong string is a rotation of first string");
			else
			{
				System.out.println("Secong string is not a rotation of first string");
			}
		}

	}

}
