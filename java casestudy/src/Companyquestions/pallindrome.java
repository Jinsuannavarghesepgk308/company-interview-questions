package Companyquestions;
import java.util.Scanner;
public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int a=n;
int rev=0,r;
while(n>0)
{
	r=n%10;
	rev=(rev*10)+r;
	n=n/10;
}
if(rev==a)
{
	System.out.println("Palindrome");
}
else
{
	System.out.println("Not a Palindrome");
}
	}

}
