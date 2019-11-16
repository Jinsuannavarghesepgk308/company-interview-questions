package Companyquestions;
import java.util.Scanner;
public class primefactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

System.out.println("Enter the number");
int n= s.nextInt();
int i;
for(i=2;i<=n;i++)
{
if(n%i==0)
{
System.out.println(i);
n=n/i;
}

}
}


	}


