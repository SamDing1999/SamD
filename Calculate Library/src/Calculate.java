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
	
	public static String toImproperFrac(int a, int b, int c){
		String answer;
		answer = ((a*c)+b+"/"+c);
		return answer;
	}
	
	public static String toMixedNum(int a,int b){
		String answer;
		answer = ((a-(a%b))/b+"_"+(a%b)+"/"+b);
		return answer;
	}
	
	public static String foil(int a, int b, int c, int d){
		String answer;
		answer = ((a*c)+"n^2"+((a*d)+(b*c))+"n"+b*d);
		return answer;
	}
	
	public static boolean isDivisibleBy(int a, int b){
		if(a%b==0){
			return true;
		}else{
			return false;
		}
	}
	
	public static double absValue(double a){
		double answer = 0;
		if(a<0){
			answer = (-1)*a;
		}else{
			answer = a;
		}
		return answer;
	}
	
	public static int max(int a,int b){
		int c = 0;
		if(a>b){
			c = a;
		}else{
			c = b;
		}
		return c;
	}
	
	public static int max(int a, int b, int c){
		int answer = 0;
		if(a>b&&a>c){
			answer = a;
		}else if(b>a&&b>c){
			answer = b;
		}else if(c>a&&c>b){
			answer = c;
		}
		return answer;
	}
	
	public static int min(int a, int b){
		int answer = 0;
		if(a<b){
			answer = a;
		}else{
			answer = b;
		}
		return answer;
	}
	
	public static double round2(double a){
		double answer;
		double b = (int)(a*100);
		answer = b/100;
		return answer;
	}
	
	public static double exponent(double a, int b){
		double answer = 1;
		for(int i = 1; i <= b; i++){
			answer *= a;
		}
		return answer;
	}
	
	public static int factorial(int a){
		int answer = 1;
		for(int i = 1;i <= a;i++){
			answer *= i;
		}
		return answer;
	}
	
	public static boolean isPrime(int a){
		boolean check;
		for(int i = a-1; i>1;i--){
			check = Calculate.isDivisibleBy(a, i);
			if(check == true){
				return false;
				}
			}
		return true;
		}
	
	
	public static int gcf(int a, int b){
		while(b!=0){
			int c = a;
			a = b;
			b = c%b;
			}
		return (int)Calculate.absValue(a);
	}
	
	public static double sqrt(double a){
		double t; 
		double squareRoot = a / 2;
		do {
			t = squareRoot;
			squareRoot = (t + (a / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
		
	}
	
	public static String quadForm(int a, int b, int c){
		String answer = "";
		double x1;
		double x2;
		double x3;
		double x4;
		if(Calculate.discriminant(a, b, c) == 0){
			x1 = (-b+Calculate.sqrt(Calculate.discriminant(a, b, c))/(2*a));
			x3 = Calculate.round2(x1);
			answer = String.valueOf(x3);
		}else if(Calculate.discriminant(a, b, c) < 0){
			answer = "no real roots";
		}else if(Calculate.discriminant(a, b, c) > 0){
			x2 = (-b-Calculate.sqrt(Calculate.discriminant(a, b, c))/(2*a));
			x4 = Calculate.round2(x2);
			x1 = (-b+Calculate.sqrt(Calculate.discriminant(a, b, c))/(2*a));
			x3 = Calculate.round2(x1);
			answer = String.valueOf(x3) + " and " + String.valueOf(x4);
		}
		return answer;
		
		
	}
}
