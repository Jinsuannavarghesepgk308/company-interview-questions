package Companyquestions;
import java.util.Scanner;
public class segregate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

System.out.println("Enter the size");
int n= s.nextInt();
int[] a= new int[n];
int i,count=0;
System.out.println("Enter the elements");
for(i=0;i<n;i++)
{
a[i]= s.nextInt();
}
for(i=0;i<n;i++)
{
if(a[i]==0)
{
count++;
}
}
for(i=0;i<count;i++)
{
a[i]=0;
System.out.printf("%d ",a[i]);
}
for(i=count;i<n;i++)
{
a[i]=1;
System.out.printf("%d ",a[i]);
}


}

}

	


