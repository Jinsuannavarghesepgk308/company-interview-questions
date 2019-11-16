package Companyquestions;
import java.util.Scanner;
public class areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int r;
double pi=3.14,area;
System.out.println("enter radius of circle");
r=s.nextInt();
area=pi*r*r;
System.out.println("Area of circle: "+area);
	}

}
