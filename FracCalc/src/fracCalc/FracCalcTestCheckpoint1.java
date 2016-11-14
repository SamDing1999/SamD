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
    	System.out.println(Arrays.toString("5_3/4 + 6_5/8".split(" ")));
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please type in your calculation");
    	String fractionCalc = input.nextLine();
    	produceAnswer(fractionCalc);
    	System.out.println(fractionCalc);
    	
    }
	
	public static String produceAnswer(String calculation){
		
		String[] parts = calculation.split(" ");
		parts[2] = parts[2].trim();
		
		
		
		return parts[2];
		
	}
}
	

	

