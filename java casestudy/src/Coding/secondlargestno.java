package Coding;
import java.util.Scanner;
public class secondlargestno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int arr[]=new int[5];
int largest=arr[0];
int secondlargest=arr[0];
for(int i=0;i<arr.length;i++)
{
	arr[i]=s.nextInt();
}
for(int i=0;i<arr.length;i++)
{
	if(arr[i]>largest)
	{
		secondlargest=largest;
		largest=arr[i];
		
	}
	else if(arr[i]>secondlargest)
	{
		secondlargest=arr[i];
	}
}
System.out.println("\n secondlargest number is:"+secondlargest);
	}

}
