/*
Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

1634 = 14 + 64 + 34 + 44
8208 = 84 + 24 + 04 + 84
9474 = 94 + 44 + 74 + 44
As 1 = 14 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */

public class DigitFifthPower {
public static void main (String [] args) {
   int sum = 0;
    for(int i=2;i<354294;i++){
    if (i==fifthpower(i))
        sum +=i;
    }
    System.out.println(" the sum of the number is : " + sum);
}
public static int fifthpower(int a){
    int sum =0 ;
    while (a != 0){
        int b = a % 10 ;
        sum += (int) Math.pow(b,5);
        a /= 10 ;
    }
    return sum;
}
}

