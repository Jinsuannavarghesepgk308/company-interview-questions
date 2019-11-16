package Coding;
import java.util.Scanner;
public class checkfibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=0,b=1,c=0;

 while(c<n)
 {
	 c=a+b;
	 a=b;
	 b=c;
	 
	}
 if(n==c) {
	 System.out.println("the given no is fibonacci");
}
 else
 
	 System.out.println("The given no is not a fibonacci ");
 
	}

}
