/*
 * */
package org.tnsif.challenge;
import java.util.Scanner;
public class ChallengeTwo {
    void movieTicket() {
    	Scanner s=new Scanner(System.in);
    	System.out.print("enter the age");
    	int age=s.nextInt();
    	System.out.print("enter the time");
    	float time=s.nextFloat();
    	if(time>=10.00 && time<=13.30 && age>13) {
    		System.out.print("The rate is = +$8");
    	}
    	else if(time>=13.30 && time<=22.00 && age>13) {
    		System.out.print("The rate is = +$5");
    	}
    	else if(time>=10.5 && time<=13.30 && age<13) {
    		System.out.print("The rate is = +$4");
    	}
    	else if(time>=13.30 && time<=22.00 && age<13) {
    		System.out.print("The rate is = +$2");
    	}
    }
	public static void main(String[] args) {
		ChallengeTwo c=new ChallengeTwo();
		c.movieTicket();
		

	}

}
