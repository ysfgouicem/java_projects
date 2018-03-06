/* Find Cost of Tile to Cover W x H Floor -
 *  Calculate the total cost of tile it would take to cover a floor plan of width and height,
 *  using a cost entered by the user.
 */
import java.util.Scanner;
public class CostTiles {

	public static void main(String[] args) {
		double fwidth ;
		double flength ;
		double tlength;
		double tcost;
		Scanner input = new Scanner (System.in) ;
		System.out.println("Enter length of floor ");
		flength = input.nextDouble();
		System.out.println("Enter width of floor ");
		fwidth = input.nextDouble();
		System.out.println("Enter length of tile ");
		tlength =  input.nextDouble();
		System.out.println("Enter cost of tile ");
		tcost= input.nextDouble();
		System.out.println("the total cost is : " + totalcost(fwidth*flength,tlength*tlength,tcost));
		input.close();
		
	}
	private static double totalcost (double floor_surface , double tile_surface , double tile_cost ) {
		double num_tiles = floor_surface / tile_surface ;
		return  tile_cost*Math.ceil(num_tiles) ;
	}
}
