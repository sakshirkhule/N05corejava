package org.tns.looping;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print("*");
			}
			System.out.println( );
		}
		
		// TODO Auto-generated method stub

	}

}
