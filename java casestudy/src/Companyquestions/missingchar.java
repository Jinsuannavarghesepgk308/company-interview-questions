package Companyquestions;
import java.util.Scanner;
public class missingchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String str=s.nextLine();
char c[]=str.toCharArray();
int arr[]=new int[26];
for(int i=0;i<c.length;i++)
{
	if(c[i]!=' ')
	{
		arr[c[i]-'a']++;
	}
}
String str1=" ";
for(int i=0;i<26;i++)
{
	if(arr[i]==0)
	{
		str1=str1+(char)(i+'a');
	}
}
System.out.println(str1);
	}
}
	


