/*Fibonacci Sequence - 
 * Enter a number and have the program generate the Fibonacci sequence to that number 
 * or to the Nth number.
 */
import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a ;
		do {
		
			System.out.println("Enter a positive number");
			a= input.nextInt();
		}
		while (a<0);
		 System.out.println("the fibonnaci result is : " +calculfibonacci(a));
		input.close();
	}
	
		//fibonacci method
	static int calculfibonacci(int num) {
		if (num == 0) return 0 ;
		else if (num == 1 || num == 2) {
            return 1;
        }

        return calculfibonacci(num - 1) + calculfibonacci(num - 2);
    }
}
