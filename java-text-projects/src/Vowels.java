/*Count Vowels 
 *  Enter a string and the program counts the number of vowels in the text. 
 * For added complexity have it report a sum of each vowel found.
 */

import java.util.*;
public class Vowels {
	static int countA, countE, countI, countO, countU, total;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter a String");
		String s = input.nextLine().toUpperCase();
		input.close();
		for (int i=0;i<s.length();i++){
			if(s.charAt(i)=='A') {
				countA++;total++;
			}
			else	if(s.charAt(i)=='E') {
				countE++;total++;
			}
			else	if(s.charAt(i)=='I') {
				countI++;total++;
			}
			else	if(s.charAt(i)=='O') {
				countO++;total++;
			}
			else	if(s.charAt(i)=='U') {
				countU++;total++;
			}
	}
		System.out.println("A:"+ countA);
		System.out.println("E:"+ countE);
		System.out.println("O:"+ countO);
		System.out.println("U:"+ countU);
		System.out.println("I:"+ countI);
		System.out.println(" total :"+ total);
		
}}
