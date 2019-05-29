/*
The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.
Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
(Please note that the palindromic number, in either base, may not include leading zeros.)
 */
public class DoubleBasePalindrome {
public static void main (String [] args){
    int sum =0 ;
    for (int i=0;i<1000000;i++) {
        if (IsPalindrome(Integer.toString(i, 2)) && IsPalindrome(String.valueOf(i))) sum += i;
    }
    System.out.println("the sum of the binary palindrome is : "+ sum);
}

private static boolean IsPalindrome(String a){
        String reverse = "";
    for ( int i = a.length() - 1; i >= 0; i-- )
        reverse = reverse + a.charAt(i);
    if (a.equals(reverse)) return true;
    return false;
}

}
