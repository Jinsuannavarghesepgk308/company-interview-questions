package Coding;

import java.util.Scanner;
public class removeduplicateno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int arr[]=new int[5];

for(int i=0;i<arr.length-1;i++)
{
	arr[i]=s.nextInt();
	
}
for(int i=0;i<arr.length-1;i++)
{

for(int j=0;j<arr.length-1;j++)
{
	if(arr[i]==arr[j])
	{
		arr[i]=0;
	}
}
}
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
	
}
}
}