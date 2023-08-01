/*to calculate hotel taireef,the roomrent is 12%high during peak sason 
 * calculate hotels buget
 * peak season april-june and nov-dec
 * month;3 rent 3000*/
package org.tnsif.challenge;
import java.util.Scanner;
public class Challenges {
	int rent=3000;
	void  calculate() {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		System.out.println("enter the number of days :");
		int d=s.nextInt();
		switch(m) {
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			System.out.println("peak season");
			double n=(rent+(rent*0.2))*d;
			System.out.print(n);
			break;
		case 1:
		case 2:
		case 3:
		case 7:
		case 10:
    	    System.out.println("not peak season");
			System.out.println("enter the number of days :");
			double y=d*rent;
			System.out.print(y);
			break;
		default:
			System.out.println("invalid month");
			break;
  		}
	}
	public static void main(String args[]) {
		Challenges c1=new Challenges();
		c1.calculate();	
	}
}
