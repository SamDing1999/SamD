/**
 * 
 */

/**
 * @author APCS1
 *
 */
public class Calculate {
	
	public static double square(double number){
		double answer;
		answer = number*number;
		return answer;
	}
	
	public static double cube(double a){
		double answer;
		answer = a*a*a;
		return answer;
	}
	
	public static double average(double b, double c){
		double answer;
		answer = (b+c)/2;
		return answer;
	}
	
	public static double average(double a, double b, double c){
		double answer;
		answer = (a+b+c)/3;
		return answer;
	}
	
	public static double toDegrees(double a){
		double answer;
		double pi = 3.14159;
		answer = (180*a)/pi;
		return answer;
	}
	
	public static double toRadians(double a){
		double answer;
		double pi = 3.14159;
		answer = (a*pi)/180;
		return answer;
	}
	
	public static double discriminant(double a, double b, double c){
		double answer;
		answer = (b*b)+(-4*a*c);
		return answer;
	}
	
	public static int toImroperFrac(int a, int b, int c){
		int numerator = (a*c)+b;
		System.out.println(numerator + "/" + c);
		return numerator;
	}
	
	public static int toMixedNum(int a,int b){
		int d = a % b;
		int e = (a - d)/b;
		System.out.println(e + "_" + d + "/" + e);
		return e;
	}
	
	public static int foil(int d, int e, int f, int g){
		int a = d*f;
		int b = (d*g)+(e*f);
		int c = e*g;
		System.out.println(a + "n^2 "+ 4 + "n " + c); 
		return a&b;
	}
}
