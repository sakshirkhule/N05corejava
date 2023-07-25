package org.tns.looping;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		do {
			System.out.println("value in n"+n);
			n++;
		}while(n<14);
		// TODO Auto-generated method stub;

	}

}
