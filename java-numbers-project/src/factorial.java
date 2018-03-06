/*Factorial Finder - 
 * The Factorial of a positive integer, n, is defined as the product of the sequence n, n-1, n-2, ...1 
 * and the factorial of zero,0, is defined as being 1. Solve this using both loops and recursion.
 */
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);		
		int a ;
		do {
			System.out.println("Enter a positive integer");
			a= input.nextInt();
		}
		while (a<0);
		 System.out.println("the factorial of "+a+" is : " +calculfactorial(a));
		input.close();
	}
	
	/* using recursion */
	
public static int  calculfactorial( int a ) {
	if (a == 0) 
	return 1 ;
	else return (a*calculfactorial(a-1)) ;
}
	/* using loop */ 

public static int calculfactorialloop(int a) {
	if (a == 0) 
		return 1;
	else {
		int fact=1;
		for(int i=a;i>0;i--) {
			fact*=i;
			a--;
		}
		return fact ;
	}
}
}
	
