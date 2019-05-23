/*
Problem : Pandigital Prime
We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once.
For example, 2143 is a 4-digit pandigital and is also prime.
What is the largest n-digit pandigital prime that exists?
 */
import java.util.Scanner;


public class Pandigital_Prime {
    public static void main (String [] args){
        for (int n = 9; n >= 1; n--) {
            int[] digits = new int[n];
            for (int i = 0; i < digits.length; i++) {
                digits[i] = i + 1;
            }
            int result = -1;
            do {
                if (isPrime(toInteger(digits)))
                    result = toInteger(digits);
            } while (nextPermutation(digits));
            if (result != -1)
                System.out.println(Integer.toString(result));
        }

    }


    private static boolean isPrime(int a ){
        if (a < 2) return false ;
        if (a % 2==0 || a %3 == 0)  return false;
        else
        {
            for (int i=4 , k = (int) Math.sqrt(a);i< k ; i++){
                if (a%i == 0 ) return false ;
            }
        }
        return true;
    }

    private static int toInteger(int[] digits){
        int result = 0;
        for (int n : digits)
        result = result * 10 + n;
        return result;
    }

    public static boolean nextPermutation(int[] a) {
        int i, n = a.length;
        for (i = n - 2; ; i--) {
            if (i < 0)
                return false;
            if (a[i] < a[i + 1])
                break;
        }
        for (int j = 1; i + j < n - j; j++) {
            int tp = a[i + j];
            a[i + j] = a[n - j];
            a[n - j] = tp;
        }
        int j;
        for (j = i + 1; a[j] <= a[i]; j++);
        int tp = a[i];
        a[i] = a[j];
        a[j] = tp;
        return true;
    }

}

