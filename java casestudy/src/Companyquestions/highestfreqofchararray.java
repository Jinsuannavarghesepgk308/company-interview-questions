package Companyquestions;
import java.util.Scanner;
public class highestfreqofchararray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String str=s.nextLine();
str.toLowerCase();
int len=str.length();
boolean f=false;
char c;
for(c='a';c<='z';c++)
{
	f=false;
	for(int i=0;i<len;i++)
	{
		if(str.charAt(i)==c)
		{
			f=true;
		break;
	}
}
if(f==false)
{
	System.out.println(c);
 break;
}
	
	}

}
}