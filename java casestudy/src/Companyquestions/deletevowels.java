package Companyquestions;
import java.util.Scanner;
public class deletevowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String str=s.nextLine();
int len=str.length();
char c;
for(int i=0;i<len;i++)
{
	c=str.charAt(i);
	if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	{
		System.out.print("");
	}
	else
	{
		System.out.print(c);
	}
}
	}

}
