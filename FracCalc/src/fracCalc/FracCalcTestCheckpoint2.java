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
    	System.out.println(Arrays.toString("5_3/4 + 6_5/8".split(" ")));
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please type in your calculation");
    	String fractionCalc = input.nextLine();
    	String answer = produceAnswer(fractionCalc);
    	System.out.println(answer);
    	
    }
	
	public static String produceAnswer(String calculation){
		//The answer of this checkpoint
		String answer;
		String checkPointTwo;
		// Checkpoint 1: print out the second operand 
		String[] parts = calculation.split(" ");
		parts[2] = parts[2].trim();
		String checkPointOne = parts[2];
		
		/*Checkpoint 2: print out the whole number the whole number portion(or 0 if not specified), 
		  the numerator(or 0 if not specified), and the denominator(or 1 if not specified).*/
		
		int numeratorPosi = parts[2].indexOf("_");
		int denominatorPosi = parts[2].indexOf("/");
		
		String whole;
		String numerator;
		String denominator;
		
		if(numeratorPosi < 0 && denominatorPosi < 0){
			whole  = parts[2];
			numerator = "0";
			denominator = "1";
		}else if(denominatorPosi >= 0 && numeratorPosi <= 0){
			numerator = parts[2].substring(0, denominatorPosi);
			denominator = parts[2].substring(denominatorPosi+1);
			whole = "0";
		}else{
			whole = parts[2].substring(0, numeratorPosi);
			numerator = parts[2].substring(numeratorPosi+1, denominatorPosi);
			denominator = parts[2].substring(denominatorPosi+1); 
		}
		checkPointTwo = "whole:" + whole + " " + "numerator:" + numerator + " " + "denominator:" + denominator;
		//return all the outputs of both checkpoints
		answer = checkPointTwo + ", "+checkPointOne;
		return answer;
	}
	
	
}
