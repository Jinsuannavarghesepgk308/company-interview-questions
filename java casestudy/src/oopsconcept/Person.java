package oopsconcept;
import java.util.*;




 class Person1 {
	 Scanner s=new Scanner(System.in);

	public void detail() 
		// TODO Auto-generated method stub
		{
			
			System.out.println("Enter the name");
			String name=s.nextLine();
			System.out.println("Enter the age");
			int age=s.nextInt();
		}
	
		public  void mark() {
		{
			System.out.println("Enter the marks");
			int mark1=s.nextInt();
			int mark2=s.nextInt();
			int tot=mark1+mark2;
			System.out.println(tot);
		}
		
	}
 }
public class Person
{
			public static void main(String args[]) {	
			Person1 p=new Person1();
			p.detail();
			p.mark();
			
		}
	}
