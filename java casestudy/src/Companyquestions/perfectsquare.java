package Companyquestions;
import java.util.Scanner;
public class perfectsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int sqrt=(int)Math.sqrt(n);
if(sqrt*sqrt==n)
{
	System.out.println(n+"is a perfect square");
}
else
{
	System.out.println(n +"is not a perfectsquare");
}
	}

}
