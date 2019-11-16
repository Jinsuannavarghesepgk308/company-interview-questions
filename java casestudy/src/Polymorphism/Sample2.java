package Polymorphism;
import java.util.Scanner;
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Details d=new Details();
		String n=s.next();
		int rn=s.nextInt();
		int y=s.nextInt();
		String de=s.next();
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int f=s.nextInt();
		int e=s.nextInt();
		int avg=0;
		int tot=0;
		
		d.details(n,rn,y,de);
		d.details(a,b,c,f,e,tot,avg);
		

	}

}
class Details {

	public void details(String n, int rn, int y, String de) {
		// TODO Auto-generated method stub
		System.out.println(n);
		System.out.println(rn);
		System.out.println(y);
		System.out.println(de);
		
	}



	public void details(int a, int b, int c, int f, int e, int tot, int avg) {
		// TODO Auto-generated method stub
		System.out.println("Malayalam="+a);
		System.out.println("English="+b);
		System.out.println("Hindi="+c);
		System.out.println("Maths="+f);
		System.out.println("Science="+e);
		tot=a+b+c+f+e;
		avg=tot/5;
		if(tot>=450)
		{
			System.out.println("rank=1");
					
		}
		if(tot>=400 && tot<=449)
		{
			System.out.println("rank=2");
		
	}
		if(tot>=350 && tot<=399)
		{
			System.out.println("rank=3");
		}
		if(tot>=300 && tot<=349)
		{
			System.out.println("rank=4");
		}
	if(tot>=250 && tot<=299)
	{
		System.out.println("rank=5");
	}
	else
	{
		System.out.println("Failed");
	}
}
	}
