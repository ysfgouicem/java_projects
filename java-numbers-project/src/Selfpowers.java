/*
The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.
Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 */

import java.math.BigInteger;

public class Selfpowers {
public static void main(String [] args) {
    BigInteger mod = BigInteger.valueOf(10).pow(10);
    BigInteger sum = BigInteger.valueOf(0);
    for (int i = 1; i <= 1000; i++) {
        sum = sum.add(BigInteger.valueOf(i).modPow(BigInteger.valueOf(i), mod));
    }
    System.out.println( sum.mod(mod));
}
}
