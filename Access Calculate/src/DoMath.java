/**
 * 
 */

/**
 * @author Sam Ding
 *Date : August 30, 2016
 */
public class DoMath {

	public static void main(String[] args) {
	
		System.out.println(Calculate.square(-5.5));
		System.out.println(Calculate.cube(5.0));
		System.out.println(Calculate.average(10.0, 6.0));
		System.out.println(Calculate.average(6.0, 8.0, 10.0));
		System.out.println(Calculate.toDegrees(6.0));
		System.out.println(Calculate.toRadians(360.0));
		System.out.println(Calculate.discriminant(8.0, 1.0, 4.0));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 4, -7));
		System.out.println(Calculate.isDivisibleBy(12, 2));
		System.out.println(Calculate.absValue(-7.0));
		System.out.println(Calculate.max(98, 67));
		System.out.println(Calculate.max(56, 74, 34));
		System.out.println(Calculate.min(56, -34));
		System.out.println(Calculate.round2(54.8973));
		System.out.println(Calculate.exponent(3.0, 3));
		System.out.println(Calculate.factorial(7));
		System.out.println(Calculate.isPrime(97));
		System.out.println(Calculate.gcf(-64, -16));
		System.out.println(Calculate.quadForm(2, 1, 4));
		
	}	
}
