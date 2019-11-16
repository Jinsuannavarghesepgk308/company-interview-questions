package Polymorphism;
import java.util.Scanner;
public class overridesample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
type obj=new type();
obj.disp();
	}

}
class abc {
	public void disp()
{
	System.out.println("Parent class");
}
}
class type extends abc {
	public void disp() {
		super.disp();
		System.out.println("Child class");
		
	}
}
