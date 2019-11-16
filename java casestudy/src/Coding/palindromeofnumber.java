package Coding;
import java.util.Scanner;
public class palindromeofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int rev=0,r;
int t=n;

while(n!=0)
{
	r=n%10;
	rev=rev*10+r;
	n=n/10;
}
if(t==rev)
{
	System.out.println("The given number is palindrome");
}
else
{
	System.out.println("The given number is not a palindrome");
}
	}

}
