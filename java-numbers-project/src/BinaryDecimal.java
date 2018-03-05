/*Binary to Decimal and Back Converter - 
 * Develop a converter to convert a decimal number to binary 
 * or a binary number to its decimal equivalent.
 */
import java.util.Scanner;
public class BinaryDecimal {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 for binary to decimal");
		System.out.println("Enter 2 for decimal to binary");
		int choice = input.nextInt() ;
		
		if(choice == 1)
		{
			System.out.print("Enter the binary number : ");
			String num = input.next();
			System.out.println("decimal result is "+ binaryToDecimal(num));
		}
		else if(choice == 2)
		{
			System.out.print("Enter the decimal number : ");
			int num = input.nextInt();
			System.out.println("binary result is " + decimalToBinary(num));
		}
		else
		{
			System.out.println("wrong choice");
		}
		input.close();
	}
	
private static String decimalToBinary(int num) {
		
		String binary = "";
		do
		{
			binary = num%2 + binary;
			num = num/2;
		}while(num>0);
		return binary;
	}
private static long binaryToDecimal(String num) {
	long decimal = 0;
	for(int i=num.length()-1;i>=0;i--)
	{
		long power = (long) Math.pow(2.0, num.length()-i-1);
		decimal+=(power*(num.charAt(i)-'0'));
	}
	return decimal;
}

}
