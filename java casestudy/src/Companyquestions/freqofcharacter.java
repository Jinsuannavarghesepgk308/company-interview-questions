package Companyquestions;
import java.util.Scanner;
public class freqofcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		int []freq=new int[str.length()];
		int i,j;
		char c []=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			freq[i]=1;
			for(j=i+1;j<str.length();j++) {
				if(freq[i]==freq[j])
				{
					freq[i]++;
					c[j]='0';
				}
			}
		}
		for(i=0;i<freq.length;i++)
		{
			if(c[i]!=' ' && c[i]!='0')
			{
				System.out.println(c[i]+"-"+freq[i]);
			}
				
		}

	}

}
