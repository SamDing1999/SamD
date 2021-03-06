package fracCalc;
 

/**
 * @author Sam Ding
 * Date : 10/20/2016
 * A program that shows math methods
 *
 */
public class Calculate {
	//A method that squares the value passed
	public static double square(double number){
		double answer;
		answer = number*number;
		return answer;
	}
	
	//A method that cubes the value passed
	public static double cube(double number){
		double answer;
		answer = number*number*number;
		return answer;
	}
	
	//A method that returns the average of two values passed
	public static double average(double firstNumber, double secondNumber){
		double answer;
		answer = (firstNumber+secondNumber)/2;
		return answer;
	}
	
	//A method that returns the average of three values passed
	public static double average(double firstNumber, double secondNumber, double thirdNumber){
		double answer;
		answer = (firstNumber+secondNumber+thirdNumber)/3;
		return answer;
	}
	
	//A method that converts an angle measure given in radians into degrees
	public static double toDegrees(double radian){
		double answer;
		double pi = 3.14159;
		answer = (180*radian)/pi;
		return answer;
	}
	
	//A method that converts an angle measure given in degrees into radians
	public static double toRadians(double degree){
		double answer;
		double pi = 3.14159;
		answer = (degree*pi)/180;
		return answer;
	}
	
	/*A method that provides the coefficients of a quadratic equation in standard
	form (a,b,and c) and returns the value of the discriminant*/
	public static double discriminant(double a, double b, double c){
		double answer;
		answer = (b*b)+(-4*a*c);
		return answer;
	}
	
	/*A method that converts mixed number(with its pieces provided separately in the order
	 whole number, numerator, then denominator) into an improper fraction*/
	public static String toImproperFrac(int whole, int numerator, int denom){
		String answer;
		if(denom == 0){
			answer = "Undefined";
		}else{
			answer = ((whole*denom)+numerator+"/"+denom);
		}
		return answer;
	
	}
	
	/*A method that converts an improper fraction(with its pieces provided separately
	in the order numerator then denominator) into a mixed number*/
		public static String toMixedNum(int numerator,int denom){
			String answer;
			if(denom == 0){
				answer = "Undefined";
			}else if(numerator == 0){
				answer = ("0");
			}else if(numerator%denom == 0){
				answer = (""+numerator/denom);
			}else{
					answer = (numerator-numerator%denom)/denom+"_"+Calculate.absValue(numerator%denom)+"/"+denom;
				
			}
			return answer;
		}
	
	/*A method that converts a binomial multiplication of the form(ax + b)(cx + d) into
	 a quadratic equation of the form (ax^x + bx + c)*/
	public static String foil(int a, int b, int c, int d, String variable){
		String answer;
		if(b*d<0){
			int positiveC = (int)Calculate.absValue(b*d);
			answer = ((a*c) + variable + "^2" + " + "+((a*d)+(b*c)) + variable + " – " + positiveC);
		}else{
			answer = ((a*c) + variable + "^2" + " + "+((a*d)+(b*c)) + variable + " + " + b*d);
		}
		return answer;
	}
	
	//A method that determines whether or not one integer is evenly divisible by another
	public static boolean isDivisibleBy(int numerator, int denom){
		if(denom!=0){
			if(numerator%denom==0){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
	//A method that returns the absolute value of the number passed
	public static int absValue(int number){
		int answer = 0;
		if(number<0){
			answer = (-1)*number;
		}else{
			answer = number;
		}
		return answer;
	}
	
	//A method that returns the larger of two values passed
	public static int max(int num1,int num2){
		int answer = 0;
		if(num1>num2){
			answer = num1;
		}else if(num2>num1){
			answer = num2;
		}else if(num1 == num2){
			answer = num1;
		}
		return answer;
	}
	
	//A method that returns the largest among three values passed
	public static double max(double num1, double num2, double num3){
		double answer = 0;
		if(num1>num2&&num1>num3){
			answer = num1;
		}else if(num2>num1&&num2>num3){
			answer = num2;
		}else if(num3>num1&&num3>num2){
			answer = num3;
		}else if(num1 == num2&&num1 == num3){
			answer = num1;
		}
		return answer;
	}
	
	//A method that returns the larger of the values padded
	public static int min(int num1, int num2){
		int answer = 0;
		if(num1<=num2){
			answer = num1;
		}else{
			answer = num2;
		}
		return answer;
	}
	
	//A method that rounds a double correctly to 2 decimal places
	public static double round2(double number){
		double answer;
		double intNumber = (int)(number*1000);
		int lastDig;
		lastDig = (int)intNumber % 10;
		if(lastDig >= 5){
			answer = ((intNumber+10-lastDig)/1000) * 1.00;
		}else{
			answer = ((intNumber - lastDig)/1000) * 1.00;
		}
		return answer;
	}
	
	//A method that raises a value to a integer power
	public static double exponent(double base, int expon){
		double answer = 1;
		if(expon > 0){
			for(int i = 1; i <= expon; i++){
				answer *= base;
			}
		}else if(expon == 0){
			answer = 1;
		}else if(expon < 0){
			for(int j = expon; j <= -1; j++){
				answer *= base;
			}
			answer = 1/answer;
		}
		return answer;
	}
	
	//A method that returns the factorial of the value passed
	public static int factorial(int number){
		int answer = 1;
		if(number == 0){
			answer = 0;
		}else if(number>0){
			for(int i = 1;i <= number;i++){
				answer *= i;
			}
		}else{
			for(int j = number; j <= -1; j++){
				answer *= j;
			}
		}
		return answer;
	}
	
	//A method that determines whether or not an integer is prime
	public static boolean isPrime(int number){
		boolean check;
		if(number>1){
			for(int i = number-1; i>1;i--){
			check = Calculate.isDivisibleBy(number, i);
			if(check == true){
				return false;
				}
			}
		}else{
			return false;
		}
		return true;
		}
	
	//A method that finds the greatest common factor of two integers
	public static int gcf(int num1, int num2){
		int originalNum1 = num1;
		int originalNum2 = num2;
		while(num2!=0){
			if(Calculate.isDivisibleBy(originalNum1, originalNum2) == true){
				num1 = num2;
			}else{
				int num3 = num1;
				num1 = num2;
				num2 = num3%num2;
		    }
		}
		int answer = Calculate.absValue(num1);
		return answer;
	}
	
	/*A method that returns an approximation of the square root of the value passed, 
	 accurate to 2 decimal places*/
	public static double sqrt(double num){
		double t; 
		double squareRoot;
		if(num == 0){
			squareRoot = 0;
		}else if(num>0){
			squareRoot = num / 2;
			do {
				t = squareRoot;
				squareRoot = (t + (num / t)) / 2;
			} while ((t - squareRoot) != 0);
		
		}else{
			squareRoot = num;
		}
		return squareRoot;
	}
	
	/*A method that uses the coefficients of a quadratic equation in standard form and uses the 
	  quadratic formula to approximate the real roots, if any*/
	public static String quadForm(int a, int b, int c){
		String answer = "";
		double x1;//the positive solution
		double x2;//the negative solution
		double x3;//round the positive solution by using Calculate.round2 method
		double x4;//round the negative solution by using Calculate.round2 method
		if(Calculate.discriminant(a, b, c) == 0){
			x1 = ((-b+Calculate.sqrt(Calculate.discriminant(a, b, c)))/(2*a));
			x3 = Calculate.round2(x1);
			answer = String.valueOf(x3);
		}else if(Calculate.discriminant(a, b, c) < 0){
			answer = "no real roots";
		}else if(Calculate.discriminant(a, b, c) > 0){
			x2 = ((-b-Calculate.sqrt(Calculate.discriminant(a, b, c)))/(2*a));
			x4 = Calculate.round2(x2);
			x1 = ((-b+Calculate.sqrt(Calculate.discriminant(a, b, c)))/(2*a));
			x3 = Calculate.round2(x1);
			if(x3>x4){
				answer = String.valueOf(x4) + " and " + String.valueOf(x3);
			}else{
				answer = String.valueOf(x3) + " and " + String.valueOf(x4);
			}
		}
		return answer;
		
		
	}
}
