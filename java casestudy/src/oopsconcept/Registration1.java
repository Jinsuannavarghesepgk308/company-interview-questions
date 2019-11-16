package oopsconcept;

import java.util.Scanner;

public class Registration1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String[] c=new String[25];
		String []e=new String[25];
		
		int i=1;

		String NO,re;
		//Register
		do {
		System.out.println("Registration");
		System.out.println("Enter the Name :");
		c[i]=s.next();
		System.out.println("Enter the address :");
		String address=s.next();
		System.out.println("Enter your contact Number :");
		String con=s.next();
		System.out.println("E-mail id :");
		e[i]=s.next();
		System.out.println("Enter proof id:");
		String ptype=s.next();
		System.out.println("Thank you for registering,your proof Id "+i);
		System.out.println("Do you want to register(yes/no) :");
		NO=s.next();
		if(NO.equals("yes")==true)
		{

		booking();

		}
		i++;
		System.out.println("Do you want to continue registration(yes/no) :");
		re=s.next();
		}
		while(re.equals("yes")==true);
		display(e,c,i);
		view(i);

		}
	private static void view(int i) {
		System.out.println("View all bookings");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the start date: ");
		String sta=s.next();
		System.out.println("Enter the end date:");
		String ed=s.next();
		System.out.println("The bookings made from "+sta+" to" +ed);
		System.out.println("Room number  Customer ID");
		for(int k=1;k<i;k++)
		{
			System.out.println(i-1+"           "+k);
			
		}
	}

		private static void display(String[] e, String[] c, int i) 
		{
		
		System.out.println("Customer id   Customer_Name       Email");
		
		
		
		for(int k=1;k<i;k++)
		{
		System.out.println(k+"              "+c[k]+"             "+e[k]);
		}

		}

		private static void booking() {
		

		String ac,pr;
		String cot;
		String cable;
		String wifi;
		String laundry;
		Scanner s=new Scanner(System.in);
		int total,b=0,c,e,d,f,i=1;
		do {
		System.out.println(" Welcome to Booking");
		System.out.println("Please choose the service requested");
		System.out.println("AC/non-AC(AC/nAC)");

		ac=s.next();
		if(ac.contentEquals("AC")==true)
		{
		b=1500;
		}
		else
		{
		b=700;
		}

		System.out.println("single cot/double cot(S/D)");
		cot=s.next();
		if(cot.equals("S")==true)
		{
		c=50;
		}
		else
		{
		c=100;
		}
		System.out.println("with cable connection/without cable connection(C/NC)");
		cable=s.next();
		if(cable.equals("C")==true)
		{
		d=50;
		}
		else
		{
		d=0;
		}
		System.out.println("wifi needed or not(W/NW)");
		wifi=s.next();
		if(wifi.equals("W")==true)
		{
		e=200;
		}
		else
		{
		e=0;
		}
		System.out.println("laundry service needed or not(L/NL)");
		laundry=s.next();
		if(laundry.equals("L")==true)
		{
		f=100;
		}
		else
		{
		f=0;
		}
		total=b+c+d+e+f;
		System.out.println("The total charge is Rs:"+total);
		System.out.println("The service choosen are:");
		if(b==1500)
		{
		System.out.println("AC");
		}
		else
		{
		System.out.println("non AC");
		}
		if(c==50)
		{
		System.out.println("single cot");
		}
		else
		{
		System.out.println("double cot");
		}
		if(d==50)
		{
		System.out.println("cable connection enabled");
		}
		else
		{
		System.out.println(" cable connection not enabled");
		}
		if(e==200)
		{
		System.out.println("wifi enabled");
		}
		else
		{
		System.out.println("wifi not enabled");
		}
		if(f==100)
		{
		System.out.println("with laundry services");
		}
		else
		{
		System.out.println("without laundry services");
		}
		
		System.out.println("Do you want to proceed? (YES/NO)");
		   pr=s.next();}
		while(pr.equals("NO"));
		{
		if(pr.equals("YES")==true)
		{

		System.out.println("Thank you  for booking.. !!! \n Your room number is "+i);
		i=i+1;
		}
		}
		}

		}

