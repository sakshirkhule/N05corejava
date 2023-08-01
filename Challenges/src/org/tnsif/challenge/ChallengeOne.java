/* when heating two items add 50% to heat time and when heating 
 * three items double the heat time heating more the three at once is not recommended
 * heat time =5.0 
 * */
package org.tnsif.challenge;
import java.util.Scanner;
public class ChallengeOne {
	
	void heatTiming() {
		Scanner s=new Scanner(System.in);
		float heatTime=5.0f;
		System.out.println("enter the number of items to be heated");
		int n=s.nextInt();
		
		if(n==2) {
			System.out.println("heattime="+(heatTime+(heatTime*0.50)));
		}
		else if(n==3) {
			System.out.println("heattime="+(heatTime*2));
		}
		else if(n==1) {
			System.out.println("heattime="+heatTime);
		}
		else {
			System.out.println("heating is not Recommed");
		}
    }

	public static void main(String[] args) {
		ChallengeOne c2=new ChallengeOne();
		c2.heatTiming();
		

	}

}
