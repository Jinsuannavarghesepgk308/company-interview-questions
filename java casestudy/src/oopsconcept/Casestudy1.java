package oopsconcept;

import java.util.Scanner;

import casestudy.Booking;

public class Casestudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


int person;
int totaldays;
double tarriff;
Scanner s=new Scanner(System.in);
System.out.println("Booking");
System.out.println("Enter the no of persons");
int a=s.nextInt();
System.out.println("enter the no of days: ");
int b=s.nextInt();
System.out.println("enter the room type: ");
String AC=s.next();
System.out.println("enter the tariff for single person: ");
int c=s.nextInt();
Season_tick st=new Season_tick();
st.Person(a);
st.Days(b);
st.gettariff(c);
a=st.setPerson();
b=st.setDays();

st.book(a,b,c);

	}

}
class Seasonbooking {
	void book(int a,int b,int c)
	{
		int tot=a*b*c;
		System.out.printf("Total Tariff:%d/-",tot);
	}
	
}
class Season_tick extends Seasonbooking {
	
	int person;
	int days;
	int tariff;
	Scanner s=new Scanner(System.in);
	void Person(int psn)
	{
		this.person=psn;
	}
	void Days(int dys)
	{
		this.days=dys;
	}
	void gettariff(int tar)
	{
		this.tariff=tar;
	}
	int setPerson()
	{
		return this.person;
	}
	int setDays()
	{
		return this.days;
	}
		int settarif()
		{
			return this.tariff;
		}
}