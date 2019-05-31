/*
The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove
digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work f
rom right to left: 3797, 379, 37, and 3.
Find the sum of the only eleven primes that are both truncatable from left to right and right to left.
NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.


 */
public class TruncatablePrimes {
    public static void main (String[] args){
        int sum = 0;
        int count =0 ;
        for (int  n = 10; count < 11;n++) {
            if (isTruncable(n)) {
                sum += n;
                count++;
            }
        }
        System.out.println("the sum is :"+sum);
    }

    private static boolean isTruncable(int a ){
        int b=a;
        for (int i =10 ; i<=a ;i*=10)
            if (!isPrime(a%i)) return false;
        for (; a != 0; a /= 10)
            if (!isPrime(a)) return false;
        return true;
    }

    private static boolean isPrime(int n) {
        if (n%2==0) return false;
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
