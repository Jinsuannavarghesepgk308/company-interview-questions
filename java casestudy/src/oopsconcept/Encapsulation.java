package oopsconcept;
import java.util.Scanner;
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Student1 st=new Student1();
				
System.out.println("Enter the name");
st.setName(s.next());
System.out.println("Enter the id");
st.setId(s.nextInt());
System.out.println("Name  "+       st.getName());
System.out.println("Id    "+           st.getId());
	}

}
