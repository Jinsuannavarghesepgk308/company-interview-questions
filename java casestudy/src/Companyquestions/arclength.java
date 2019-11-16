package Companyquestions;
import java.util.Scanner;
public class arclength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the radius");
int radius=s.nextInt();
double pi=3.14,arclength;
System.out.println("enter the angle");
int angle=s.nextInt();
arclength=(2*pi*radius*angle)/360;
System.out.println("length of the arc is:"+arclength);
	}

}
