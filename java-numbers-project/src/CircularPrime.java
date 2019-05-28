/*
The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.
There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
How many circular primes are there below one million?
 */
public class CircularPrime {
    public static void main(String [] args){
    int n =13 ;
        for (int i=100 ;i<1000000;i++) {
            if (Iscircular(i)) n++ ;
        }
        System.out.println(" the number of prime number is : " + n);
    }

    private  static boolean Iscircular(int n){
        String a = String.valueOf(n);
        for (int i=0 ;i<a.length();i++){
           a =  a.substring(1) + a.substring(0,1);
            if (!isPrime(Integer.valueOf(a))) return false;
        }
        return true ;
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
