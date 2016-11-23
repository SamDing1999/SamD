package fracCalc;
import java.util.*;
import org.junit.Test;

// Checkpoint 1-only tests
public class FracCalcTestCheckpoint1
	{
    @Test public void testCheckpoint1_1() {  FracCalcTestALL.assertForEarlyCheckpoints("6_5/8", "whole:6 numerator:5 denominator:8", "12_3/8", FracCalc.produceAnswer("5_3/4 + 6_5/8"));}
    @Test public void testCheckpoint1_2() {FracCalcTestALL.assertForEarlyCheckpoints("20", "whole:20 numerator:0 denominator:1", "-20_3/7", FracCalc.produceAnswer("-3/7 - 20"));}
    @Test public void testCheckpoint1_3() {FracCalcTestALL.assertForEarlyCheckpoints("27/21", "whole:0 numerator:27 denominator:21", "-33_2/7", FracCalc.produceAnswer("-32 - 27/21"));}
	
    public static void main(String[] args){
    	
    	Scanner userInput = new Scanner(System.in);
    	System.out.println("Please type in your calculation");
    	String fractionCalc = userInput.nextLine();
    	String answer = produceAnswer(fractionCalc);
    	System.out.println(answer);
    	
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
    	
    	return secondOperand;
    	
    	
	}
}
	

	

