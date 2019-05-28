/*
We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once;
 for example, the 5-digit number, 15234, is 1 through 5 pandigital.
The product 7254 is unusual, as the identity, 39 × 186 = 7254,
 containing multiplicand, multiplier, and product is 1 through 9 pandigital.
Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.
HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.
 */
import java.util.Arrays;

public class PandigitalProduct {

    public static void main (String [] args){
    int sum =0 ;
    for (int i =0 ;i<10000;i++){
        if (hasPandigitalProduct(i))
            sum += i;
    }
    System.out.println(" the final sum is : " + sum);

    }

    static boolean isPandigital(String n) {
        if (n.length() != 9)  return false;
    char[] temp = n.toCharArray();
     Arrays.sort(temp);
     return new String(temp).equals("123456789");
    }

     static boolean hasPandigitalProduct(int n) {
        for (int i = 1; i <= n; i++) {
        if (n % i == 0 && isPandigital("" + n + i + n/i)) return true;
        }
        return false;
    }
}
