package Coding;
import java.util.Scanner;
public class largestnoinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		int largest=a[0];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}
			System.out.println("largest no: "+largest);
		}

	}


