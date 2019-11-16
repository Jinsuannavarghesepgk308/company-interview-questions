package Companyquestions;
import java.util.Scanner;
public class lengthofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String str=s.nextLine();
int i=0;
for(char c:str.toCharArray())
{
	i++;
}
System.out.println(i);
	}

}
