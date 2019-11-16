package Companyquestions;
import java.util.Scanner;
public class replacestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

String str="C|C++|JAVA|ANDROID";
str=str.replace('|',',');
System.out.println(str);
	}

}
