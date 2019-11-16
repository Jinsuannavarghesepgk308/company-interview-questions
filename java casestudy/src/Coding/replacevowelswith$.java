package Coding;
import java.util.Scanner;
public class replacevowelswith$ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.nextLine();


System.out.println(str.replaceAll("[aeiou]", '$'));
	}
	}


