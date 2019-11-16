package Polymorphism;
import java.util.Scanner;
public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Price p=new Price();
		
		System.out.println("enter the first item");
		String n1=s.next();
		int a=s.nextInt();
		System.out.println("enter the second item");
		String n2=s.next();
		int b=s.nextInt();
		System.out.println("enter the third item");
		String n3=s.next();
		int c=s.nextInt();
		int tot=0;
		p.price(n1,n2,n3);
		p.price(a,b,c,tot);
		

	}

}
class Price {

	public void price(String n1, String n2, String n3) {
		// TODO Auto-generated method stub
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}

	public void price(int a, int b, int c, int tot) {
		// TODO Auto-generated method stub
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		tot=a+b+c;
		if(tot>=100)
		{
			System.out.println("Buy three items");
		}
		if(tot>=50 && tot<=99)
		{
			System.out.println("Buy two items");
		}
		if(tot>=20 && tot<=49)
		{
			System.out.println("Buy one item");
		}
		else
		{
			System.out.println("Cannot buy any items");
		}
		}
		
		
	}
	
	

