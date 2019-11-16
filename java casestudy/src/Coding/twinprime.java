package Coding;
import java.util.Scanner;
public class twinprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int s1,flag=0,i,j;
		s1=s.nextInt();
		for(i=2;i<=s1+1;i++)
		{
			for(j=1;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.println(i);
				}
			}
		}
}