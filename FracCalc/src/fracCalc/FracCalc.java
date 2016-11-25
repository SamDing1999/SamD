package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner userInput = new Scanner(System.in);
    	System.out.println("Enter your operation.");
    	String input = userInput.nextLine();
    	if (input.equals("quit")){
    		String answer=produceAnswer(input);
    		System.out.println(answer);
    	}
    	produceAnswer(input);
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
    	String firstOperand = new String();
		String operator = new String();
		String secondOperand = new String();
		int firstSpace = input.indexOf(" ");
    	int secondSpace = input.indexOf(" ", firstSpace + 2);
    	operator = input.substring(firstSpace+1, secondSpace);
    	firstOperand = input.substring(0, firstSpace);
    	secondOperand = input.substring(secondSpace+1, input.length());
    	
    	return componentOfFraction(secondOperand);
    	
    	
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    public static String componentOfFraction(String operand){
    	int numeratorPosi = operand.indexOf("_");
		int denominatorPosi = operand.indexOf("/");
		
		String whole;
		String numerator;
		String denominator;
		
		if(numeratorPosi < 0 && denominatorPosi < 0){
			whole  = operand;
			numerator = "0";
			denominator = "1";
		}else if(denominatorPosi >= 0 && numeratorPosi <= 0){
			numerator = operand.substring(0, denominatorPosi);
			denominator = operand.substring(denominatorPosi+1);
			whole = "0";
		}else{
			whole = operand.substring(0, numeratorPosi);
			numerator = operand.substring(numeratorPosi+1, denominatorPosi);
			denominator = operand.substring(denominatorPosi+1); 
		}
		return ("whole:" + whole + " " + "numerator:" + numerator + " " + "denominator:" + denominator);
    }
}
