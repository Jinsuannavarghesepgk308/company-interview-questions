package Companyquestions;
import java.util.Scanner;
public class distinctelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int arr[]=new int[n];
int i,j;
for(i=0;i<n;i++)
{
	for(j=0;j<=i;j++)
	{
		if(arr[i]==arr[j])
		{
			break;
		}
	}
	if(i==j)
	{
		System.out.println(arr[i]+" ");
	}
}
	}

}
