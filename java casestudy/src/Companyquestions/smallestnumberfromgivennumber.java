package Companyquestions;
import java.util.Scanner;
public class smallestnumberfromgivennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int smallest=0;
System.out.println("enter the number");

int n=s.nextInt();//how many number want to enter
for(int i=0;i<n;i++)
	int r=n%2;

{
	int num=s.nextInt();//comparing each number entered with large one
	if(i==0 &&num>0)
	if(num<smallest)
	{
		smallest=num;
	}
}
System.out.println("The smallest number is:"+smallest);
	}

}
