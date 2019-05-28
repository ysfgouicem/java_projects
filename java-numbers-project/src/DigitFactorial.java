/*
145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
Find the sum of all numbers which are equal to the sum of the factorial of their digits.
Note: as 1! = 1 and 2! = 2 are not sums they are not included.
 */
public class DigitFactorial {
    public static void main (String [] args){
        int sum =0 ;
        for (int i=10;i<100000;i++){
            if (IsCurious(i)) sum += i ;
        }
        System.out.println("the sum of all curious numbers is : "+ sum);
    }
    private static  boolean IsCurious(int a){
        int tmp =a ;
        int sum =0;
        for (int i=0;i<String.valueOf(a).length();i++){
            sum += factorial(tmp%10) ;
            tmp=tmp/10;
        }
        if (sum==a) return true;
        return false ;
    }
    private static int factorial(int a ) {
        if (a == 0)
            return 1 ;
        else return (a*factorial(a-1)) ;
    }
}
