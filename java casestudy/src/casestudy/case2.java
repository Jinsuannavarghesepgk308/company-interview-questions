package casestudy;

import java.util.Scanner;

public class case2 {

	public static void main(String[] args) {
		int a;
		String str;
		Scanner sc = new Scanner(System.in);
		Booking1 b = new Booking1();
		do {
		System.out.println("Menu");
		System.out.println("1.Book\n2.CheckStatus\n3.Exit");
		System.out.println("Enter your choice");
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
		b.book();
		break;
		case 2:
		b.checkstatus();
		break;
		case 3:
			break;
		}
		str=sc.next();
		}while(str.equals("no"));
		sc.close();
	}
}