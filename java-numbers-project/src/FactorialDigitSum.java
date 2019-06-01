/* p(20)
n! means n × (n − 1) × ... × 3 × 2 × 1
For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
Find the sum of the digits in the number 100!
 */
import java.math.BigInteger;
public class FactorialDigitSum {
public static void main(String [] args){
    String a = fact(100).toString();
    int sum =0 ;
    for (int i=0;i<String.valueOf(a).length();i++) {
     sum += Integer.valueOf(a.charAt(i)-'0');
    }
    System.out.println(" the sum is :"+ sum);
}

    static BigInteger fact(int b)
    {
        if(b <= 1)
            return BigInteger.ONE;
        BigInteger result = BigInteger.ONE ;
        for (int i = 2; i <= b; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

}
