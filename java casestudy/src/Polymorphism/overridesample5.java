package Polymorphism;

import java.util.Scanner;

public class overridesample5 {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	dcs obj=new dcs();
	obj.disp();
		}

	}
	class srt {
		public void disp()
	{
		System.out.println("Parent class");
	}
	}
	class dcs extends srt {
		public void disp() {
			super.disp();
			System.out.println("Child class");
			
		}
	


	

}
