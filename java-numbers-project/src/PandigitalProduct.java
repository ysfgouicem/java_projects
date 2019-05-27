import java.util.Arrays;

public class PandigitalProduct {

    public static void main (String [] args){
    int sum =0 ;
    for (int i =0 ;i<10000;i++){
        if (hasPandigitalProduct(i))
            sum += i;
    }
    System.out.println(" the final sum is : " + sum);

    }

    static boolean isPandigital(String n) {
        if (n.length() != 9)  return false;
    char[] temp = n.toCharArray();
     Arrays.sort(temp);
     return new String(temp).equals("123456789");
    }


     static boolean hasPandigitalProduct(int n) {
        for (int i = 1; i <= n; i++) {
        if (n % i == 0 && isPandigital("" + n + i + n/i)) return true;
        }
        return false;
    }
}
