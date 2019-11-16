package Coding;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str,rev="";
System.out.println("Enter the string:  ");
str=s.next();
String t=str;
int len=t.length();
for(int i=len-1;i>=0;i--)
	rev=rev+t.charAt(i);
if(t.equals(rev))
{
	System.out.println("The given string is a palindrome");
	
}
else
{
	System.out.println("The given string is not a palindrome");
}
	}
}
