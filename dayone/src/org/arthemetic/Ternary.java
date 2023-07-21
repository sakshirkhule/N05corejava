//program for  trenary operator
package org.arthemetic;
import java.util.Scanner;
public abstract class Ternary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		String res=(num%2==0)?"even":"Odd";
		System.out.println("Result "+ res);
		// TODO Auto-generated method stub

	}

}
