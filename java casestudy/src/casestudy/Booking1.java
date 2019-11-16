package casestudy;

import java.util.Scanner;

public class Booking1 {

	
		public static int booked[]=new int[25];
		Scanner sc = new Scanner(System.in);
		String str;
		static void book(){
			String ac,pr;
			String cot;
			String cable;
			String wifi;
			String laundry;
			int total,b=0,c,d,e,f,i=1;
			Scanner sc = new Scanner(System.in);
			do {
			
			System.out.println("AC/non-AC(AC/nAC)");
			ac=sc.next();
			if(ac.equals("AC")==true)
			{
				b=1000;
			}
			else
			{
				b=750;
			}
			System.out.println("Cot(Single/Double)");
			cot=sc.next();
			if(cot.equals("Single")==true)
			{
				c=0;
			
			}
			else
			{
				c=350;
			}
			System.out.println("With cable connection/without cable connection(C/nC");
			cable=sc.next();
		if(cable.equals("C")==true)	
		{
			d=50;
		}
		else
		{
			d=0;
		}
		System.out.println("Wi-Fi needed or not(W/nW");
		wifi=sc.next();
		if(wifi.equals("W")==true)
		{
			e=200;
		}
		else
		{
			e=0;
		}
		System.out.println("Laundry service needed or not(L/nL");
		laundry=sc.next();
		if(laundry.equals("L")==true)
		{
			f=100;
		}
		else
		{
			f=0;
		}
		total=b+c+d+e+f;
		System.out.printf("The total charge is Rs."+total);
		System.out.println("The service chosen are");
		if(b==1000)
		{
			System.out.println("AC");
		}
		else
		{
			System.out.println("non-AC");
		}
		if(c==0)
		{
			System.out.println("Single cot");
		}
		else
		{
			System.out.println("double cot");

		}
		if(d!=0)
		{
			System.out.println("Cable connection enabled");
		}
		else
		{
			System.out.println("Cable connection not enabled");
		}
		if(e!=0)
		{
			System.out.println("Wifi enabled");
		}
		else
		{
			System.out.println("Wifi not enabled");
		}
		if(f!=0)
		{
			System.out.println("with laundry services");
			
		}
		else
		{
			System.out.println("without laundry services");
		}
		System.out.println("Do you want to proceed");
		 pr=sc.next();

			}
			while(pr.equals("no"));
		    if(pr.equals("yes")==true)
		{
			booked[i]=1;
			System.out.println("Thank you for booking.Your room number is "+i);
			System.out.println("Do you want to continue");
			i=i+1;
			
		}
		
		}
		public void checkstatus() {
			// TODO Auto-generated method stub
			int flag=0;
			System.out.println("Check Status:");
			System.out.println("Enter room number");
			int r = sc.nextInt();
			for(int i=0;i<25;i++)
			{
			if(booked[i]==r)
			{
			flag=1;
			break;
			}
			}
			if(flag==1)
			{
			System.out.printf("Room number %d is booked",r);
			}
			else
			{
			System.out.printf("Room number %d is not booked", r);
			}
			System.out.println("Do you want to continue");
			str=sc.next();
		
		
		while(str.equals("yes"));
			}

			}
	
	
	


	