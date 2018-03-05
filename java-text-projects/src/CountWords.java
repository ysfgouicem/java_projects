/*Count Words in a String 
 *  Counts the number of individual words in a string.
 *  For added complexity read these strings in from a text file and generate a summary.
 */
import java.util.Scanner;
import java.io.*;
public class CountWords {

	public static void main(String[] args) {
		
			// user provides String
		
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence ! ");
		String s = input.nextLine() ;
		input.close();
		System.out.println(s.split(" ").length) ;*/
	
			// String from file 

		try{
			Scanner input = new Scanner(new File("src/test.txt")); 
			String s = input.nextLine() ;
			input.close();
			System.out.println(s.split(" ").length) ;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
