/* Coin Flip Simulation -
 *  Write some code that simulates flipping a single coin however many times the user decides.
 *  The code should record the outcomes and count the number of tails and heads.
 */
import java.util.Scanner;
public class coinflip {
	public static void main(String[] args) {
		int h=0 ;
		int t=0 ;
		int n=0	;
		int c=0 ;
		Scanner input= new Scanner (System.in);
		System.out.println("Enter number of coins to flip ");
		n=input.nextInt() ;
		input.close();
		while (n>0) {
		 	c= (int)Math.floor(Math.random() * 2);
		 	System.out.println(c);
		 	n--;
		 	if (c==0) h++;
		 	else t++;
		}
		System.out.println("number of tails = "+ t + " number of heads = " + h );
	}

}
