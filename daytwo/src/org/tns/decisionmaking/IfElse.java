package org.tns.decisionmaking;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int age=sc.nextInt();
		int Weight=sc.nextInt();
		
		if((age>18)&&(Weight>50)) {
			System.out.print("Eligible for donation");
		}
		else {
			System.out.print("not eligible for donation");
		}
		// TODO Auto-generated method stub

	}

}
