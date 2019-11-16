package Companyquestions;
import java.util.Scanner;
public class charactervowelorconsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the character");
		char c = s.next().charAt(0);
		if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			
		{
			System.out.println("Vowels");
		}
		else
		{
			System.out.println("Consonants");
		}
	}

}
