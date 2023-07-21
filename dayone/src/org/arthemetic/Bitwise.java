package org.arthemetic;
import java.util.Scanner;
public class Bitwise {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		System.out.println(x>>y);
		System.out.println(x<<y);
		
	}

}
