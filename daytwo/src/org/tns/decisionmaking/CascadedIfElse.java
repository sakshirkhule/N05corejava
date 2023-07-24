//program to demonstrate on cascaded if else
package org.tns.decisionmaking;
import java.util.Scanner;
public class CascadedIfElse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age1=s.nextInt();
		int age2=s.nextInt();
		int age3=s.nextInt();
		if(age1>age2 && age1>age3) {
			System.out.print("Age1 is greater");
		}
		else if(age2>age1 && age2>age3) {
			System.out.print("Age2 is greater");
			
		}
		else {
			System.out.print("age3 is greater");
		}
		
		// TODO Auto-generated method stub

	}

}
