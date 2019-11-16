package Companyquestions;
import java.util.Scanner;
public class insertingelementinbtwarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int len,p,ele;
System.out.println("enter length of an array");
len=s.nextInt();
int arr[]=new int[len+1];
System.out.println("Enter"+len+"element");
for(int i=0;i<len;i++)
{
	arr[i]=s.nextInt();
	
}
System.out.println("Enter the position want to insert an element");
p=s.nextInt();
System.out.println("Enter the element want to insert");
ele=s.nextInt();
for(int i=len-1;i>=(p-1);i--)
{
	arr[i+1]=arr[i];
}
arr[p-1]=ele;
System.out.println("After inserting");
for(int i=0;i<=len;i++)
{
	System.out.println(arr[i]+"");
}

	}

}
