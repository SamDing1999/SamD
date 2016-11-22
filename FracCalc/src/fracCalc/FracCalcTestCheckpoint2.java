package fracCalc;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

// Checkpoint 2-only tests
public class FracCalcTestCheckpoint2
{
    @Test public void testCheckpoint2_1() {  FracCalcTestALL.assertForEarlyCheckpoints(null, "whole:6 numerator:5 denominator:8", "12_3/8", FracCalc.produceAnswer("5_3/4 + 6_5/8"));}
    @Test public void testCheckpoint2_2() {  FracCalcTestALL.assertForEarlyCheckpoints(null, "whole:20 numerator:0 denominator:1", "-20_3/7", FracCalc.produceAnswer("-3/7 - 20"));}
    @Test public void testCheckpoint2_3() {  FracCalcTestALL.assertForEarlyCheckpoints(null, "whole:0 numerator:27 denominator:21", "-33_2/7", FracCalc.produceAnswer("-32 - 27/21"));}


    public static void main(String[] args){
    	Scanner userInput = new Scanner(System.in);
    	System.out.println("Enter your operation.");
    	String input = userInput.nextLine();
    	if (input.equals("quit")){
    		String answer=produceAnswer(input);
    		System.out.println(answer);
    	}
    	produceAnswer(input);
    	
    }
	
	public static String produceAnswer(String input){
		String firstOperand = new String();
		String operator = new String();
		String secondOperand = new String();
		int firstSpace = input.indexOf(" ");
    	int secondSpace = input.indexOf(" ", firstSpace + 2);
    	operator = input.substring(firstSpace+1, secondSpace);
    	firstOperand = input.substring(0, firstSpace);
    	secondOperand = input.substring(secondSpace+1, input.length());
    	
    	//checkpoint 2:
		int numeratorPosi = secondOperand.indexOf("_");
		int denominatorPosi = secondOperand.indexOf("/");
		
		String whole;
		String numerator;
		String denominator;
		
		if(numeratorPosi < 0 && denominatorPosi < 0){
			whole  = secondOperand;
			numerator = "0";
			denominator = "1";
		}else if(denominatorPosi >= 0 && numeratorPosi <= 0){
			numerator = secondOperand.substring(0, denominatorPosi);
			denominator = secondOperand.substring(denominatorPosi+1);
			whole = "0";
		}else{
			whole = secondOperand.substring(0, numeratorPosi);
			numerator = secondOperand.substring(numeratorPosi+1, denominatorPosi);
			denominator = secondOperand.substring(denominatorPosi+1); 
		}
		return ("whole:" + whole + " " + "numerator:" + numerator + " " + "denominator:" + denominator);
		
	}
	
	
}
