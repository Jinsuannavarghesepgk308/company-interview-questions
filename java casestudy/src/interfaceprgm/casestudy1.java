package interfaceprgm;
import java.util.Scanner;
public class casestudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter the address");
		String a=s.next();
        System.out.println("Enter the contactno");
		int b=s.nextInt();
		System.out.println("Enter the email");
		String c=s.next();
		System.out.println("Enter the prooftype");
		String d=s.next();
		System.out.println("Enter the proofid");
		String e=s.next();
        Person p=new Person();
        
        
        System.out.println("Thank you for registering.Your id is 1...");
        System.out.println("Do you want to continue registration(y/n)");
        String pr=s.next();
        if(pr.equals("y")==true || pr.equals("n")==true)

{
	System.out.println("Do ypu want to update the email id?(yes/no)");
	String op=s.next();
	if(op.equals("y")==true) {
		System.out.println("Update Email:");
		System.out.println("Enter new Email id");
		String pq=s.next();
		c=pq;
		System.out.println("Email id is updated");
		System.out.println("Your details are as follows");
		System.out.println("name:      "+name);
		System.out.println("address:   "+a);
		System.out.println("contactno: "+b);
		System.out.println("prooftype: "+d);
		System.out.println("proofid:   "+e);
	}
}
	}

}
interface records {
	public void details(String name,String a,int b,String c,String d,int e);
	
}

class Person implements records {
	public void details(String name,String a,int b,String c,String d,int e)
	{
		System.out.println("Name->"+name);
		System.out.println("Address->"+a);
		System.out.println("Contactno->"+b);
		System.out.println("Email->"+c);
		System.out.println("Prooftype->"+d);
		System.out.println("Proofid->"+e);
		
	}
	
	}
