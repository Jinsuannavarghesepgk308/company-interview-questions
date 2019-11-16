package Companyquestions;
import java.util.Scanner;
public class wordlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String text=" ";
		int count=0;
		System.out.println("Enter the string");
		text=s.nextLine();
		for(int i=0;i<text.length()-1;i++)
		{
			if(text.charAt(i)==' ' && text.charAt(i+1)!=' ')
				count++;
			
		}
		System.out.println("Total number of words in string are: "+(count+1));

	}

}
