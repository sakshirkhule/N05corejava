package org.tns.decisionmaking;
import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=12) {
			if(weight>=40) {
				System.out.print("Eligible for Bunjee jumping");
				 
			    if(weight>=110) {
				System.out.print("need extra rope for banjee jumping");
		       	}
			
			}
			else {
				System.out.print("not eligible");
			}
			
		}
		else {
			System.out.print("not eligible");
		}
		// TODO Auto-generated method stub

	}

}
