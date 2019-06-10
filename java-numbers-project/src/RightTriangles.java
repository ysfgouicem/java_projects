/* p39
If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are exactly three solutions for p = 120.
{20,48,52}, {24,45,51}, {30,40,50}
For which value of p ≤ 1000, is the number of solutions maximised?
 */
public class RightTriangles {
public static void main (String... args){
    int max_perimeter = 0;
    int max_triangles = 0;
    for (int p = 120; p <= 1000; p++) {
        int triangles = Calculate_Possibilities(p);
        if (triangles > max_triangles) {
            max_triangles = triangles;
            max_perimeter = p;
        }
    }
    System.out.println(" the result is : "+ max_perimeter);
}
static int Calculate_Possibilities(int perimeter){
    int n =0 ;
    for (int a = 120; a <= perimeter/4; a++) {
        for (int b = a; b <= perimeter/2; b++) {
            int c = perimeter - a - b;
            if (a * a + b * b == c * c)
                n++;
        }
    }
    return n;
}
}
