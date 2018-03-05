/*Happy Numbers -
 *   A happy number is defined by the following process.
 *   Starting with any positive integer, replace the number by the sum of the squares of its digits,
 *   and repeat the process until the number equals 1 (where it will stay), 
 *   or it loops endlessly in a cycle which does not include 1.
 *   Those numbers for which this process ends in 1 are happy numbers, 
 *   while those that do not end in 1 are unhappy numbers. Display an example of your output here.
 *   Find first 8 happy numbers.
 */


import java.util.ArrayList;
import java.util.Scanner;
public class happynumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int a ;
		do {
			System.out.println("Enter a positive number");
			a= input.nextInt();
		}
		while (a<1);
		input.close();
		
		int counter =0 ;
		System.out.println("the first 8 happy numbers are :");
		while (counter < 8 ) {
			if (isHappy(a)) {
				counter ++;
				System.out.println(a);
			}
			a++;
		}
	}

	public static boolean isHappy(int num) {
		
 ArrayList<Integer> list = new ArrayList<Integer>();
		
	while(num!=1){
			list.add(num);
			
			int sum = 0;
			while(num!=0){
				sum+= Math.pow(num%10,2);
				num/=10;
			}
			num = sum;
			if(list.contains(num)){
				return false;
			}
			
		}
				return true;
	}

}
