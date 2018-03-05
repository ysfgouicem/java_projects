/*Check if Palindrome -
 *  Checks if the string entered by the user is a palindrome.
 *  That is that it reads the same forwards as backwards like “racecar”
 */


import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in) ;
		System.out.println("Enter a string");
		String a = input.nextLine() ;
		if (a.equals(new StringBuilder(a).reverse().toString())) 
			System.out.println("Palindrome !!");
		else 
			System.out.println("Not Palindrome");
		input.close();
		
	}

}
