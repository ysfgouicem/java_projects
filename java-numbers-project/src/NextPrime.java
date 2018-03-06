/* Next Prime Number -
 *  Have the program find prime numbers until the user chooses to stop asking for the next one.
 */
import java.util.Scanner;
public class NextPrime {
	static int num =2;
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		int answer  ;
		do {
			System.out.println("Do you want next prime number \n 1 : yes \n 0 : no");
		answer = input.nextInt() ;
		if(answer == 0)  { 
				System.out.println("end ...");
		}
		else if(answer ==1) {
			num=getnextprime(num) ;
			System.out.println("the prime number is : " + num);
		}
	} while (answer==1);
input.close() ;
}
	private static int getnextprime(int a) {
		 int next_prime = a + 1;

		   while (true) {
		       if (isPrime(next_prime)) {
		           return next_prime;
		       } else {
		           next_prime++;
		       }
		   }
	}
	 /* returns 2 as a non-prime (2 is the oddest prime number) but faster than other ways */ 
	private static boolean isPrime(int n) {
	    if (n%2==0) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
