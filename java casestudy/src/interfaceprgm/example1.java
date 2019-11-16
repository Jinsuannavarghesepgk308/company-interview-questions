package interfaceprgm;
import java.util.Scanner;
public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the name");
String name=s.next();
System.out.println("enter the id");
int a=s.nextInt();
System.out.println("enter the total");
int t =s.nextInt();
Stud2 st=new Stud2();
st.detail(name,a);
st.total(t);

	}

}
interface rank {
	public void detail(String name,int a);
	
}
interface total {
	public void total(int t);
}
class Stud2 implements rank,total {
	public void detail(String name,int a)
	{
		System.out.println("Name->"+name);
		System.out.println("Student Id->"+a);
	}
	public void total(int t) {
		System.out.println("total->"+t);
	}
}
