/*Reverse a String -
 *  Enter a string and the program will reverse it and print it out.
 */
 
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter a String");
	 System.out.println(new StringBuilder(input.nextLine()).reverse().toString()) ;
	 input.close();
	}

}
