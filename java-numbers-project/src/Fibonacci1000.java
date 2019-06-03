/*
1000-digit Fibonacci number :
The Fibonacci sequence is defined by the recurrence relation:

Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
Hence the first 12 terms will be:
F1 = 1 ,F2 = 1 ,F3 = 2 ,F4 = 3 ,F5 = 5 ,F6 = 8 ,F7 = 13 ,F8 = 21 ,F9 = 34 ,F10 = 55 ,F11 = 89 ,F12 = 144
The 12th term, F12, is the first term to contain three digits.
What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci1000 {
    public static void main (String [] args){
        Map<Integer,BigInteger> sequence = new HashMap<Integer,BigInteger>() ;
        sequence.put(Integer.valueOf(1),BigInteger.ONE);
        sequence.put(Integer.valueOf(2),BigInteger.ONE);
        int i =3 ;
        while(sequence.get(i-1).toString().length() != 1000){
            sequence.put(Integer.valueOf(i),sequence.get(i-1).add(sequence.get(i-2))) ;
         i++;
        }
        System.out.println(" the index is : "+ (i-1) );
    }

}
