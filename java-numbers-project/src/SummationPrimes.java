/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
 */
public class SummationPrimes {
    public static void main (String [] args){
        int sum=0;
        for (int i=0 ;i<2000000 ;i++){
            if (isPrime(i)) sum+=i;
        }
        System.out.println("the sum of prime number is "+ sum);
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
