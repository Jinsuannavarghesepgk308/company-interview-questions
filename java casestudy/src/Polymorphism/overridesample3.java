package Polymorphism;
import java.util.Scanner;
public class overridesample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Demo obj=new Demo();
obj.disp();

	}

}
class ABC {
	public void disp() {
		System.out.println("Parent class");
	}
}
class Demo extends ABC 
{
	 public void disp() {
		 System.out.println("Child class");
	 }
}