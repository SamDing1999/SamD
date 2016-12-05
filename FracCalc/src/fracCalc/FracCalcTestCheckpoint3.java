package fracCalc;
import java.util.*;
import org.junit.Test;

// Checkpoint 3-only tests
public class FracCalcTestCheckpoint3
{
    @Test public void testCheckpoint3_AdditionSimple3() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "4_3/7", FracCalc.produceAnswer("1_1/7 + 3_2/7"));}
    @Test public void testCheckpoint3_AdditionWholeNumbers2() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "1", FracCalc.produceAnswer("2/3 + 1/3"));}
    @Test public void testCheckpoint3_AdditionWholeNumbers7() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "1021778", FracCalc.produceAnswer("124543 + 897235"));}
    @Test public void testCheckpoint3_AdditionWithNegatives4() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "-1_1/4", FracCalc.produceAnswer("-3_3/4 + 2_2/4"));}
    @Test public void testCheckpoint3_AdditionImproperFractionsAndReductions2() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "1_1/20", FracCalc.produceAnswer("4/5 + 2/8"));}
    @Test public void testCheckpoint3_AdditionCombined4() { FracCalcTestALL.assertForEarlyCheckpoints(null, null, "62_11/19", FracCalc.produceAnswer("0 + 34_543/19"));}
    @Test public void testCheckpoint3_SubtractionSimple3() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "0", FracCalc.produceAnswer("4_1/2 - 4_1/2"));}
    @Test public void testCheckpoint3_SubtractionWithNegatives3() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "-1_1/4", FracCalc.produceAnswer("-3_3/4 - -2_2/4"));}
    @Test public void testCheckpoint3_SubtractionCombined2() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "8_5/21", FracCalc.produceAnswer("-12_3/7 - -20_2/3"));}
    @Test public void testCheckpoint3_MultiplicationBasic1() {  FracCalcTestALL.assertForEarlyCheckpoints(null, null, "3", FracCalc.produceAnswer("1_1/2 * 2"));}
    @Test public void testCheckpoint3_MultiplicationBasic10() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "378/943", FracCalc.produceAnswer("27/41 * 14/23"));}
    @Test public void testCheckpoint3_MultiplicationBasic3() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "164268", FracCalc.produceAnswer("234 * 702"));}
    @Test public void testCheckpoint3_MultiplicationWithNegatives2() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "-8", FracCalc.produceAnswer("-12/3 * 2/1"));}
    @Test public void testCheckpoint3_MultiplicationWithNegatives6() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "15_5/7", FracCalc.produceAnswer("-3_2/3 * -4_2/7"));}
    @Test public void testCheckpoint3_MultiplicationByZero2() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "0", FracCalc.produceAnswer("0 * 0"));}
    @Test public void testCheckpoint3_MultiplicationByZero3() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "0", FracCalc.produceAnswer("0 * 9321"));}
    @Test public void testCheckpoint3_MultiplicationByZero4() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "0", FracCalc.produceAnswer("0 * -5902"));}
    @Test public void testCheckpoint3_MultiplicationCombined1() {   FracCalcTestALL.assertForEarlyCheckpoints(null, null, "1065_115/168", FracCalc.produceAnswer("-32_75/16 * -27_43/21"));}
    @Test public void testCheckpoint3_MultiplicationCombined2() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "-15_67/943", FracCalc.produceAnswer("1_27/41 * -3_140/23"));}
    @Test public void testCheckpoint3_DivisionBasic1() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "9/16", FracCalc.produceAnswer("3/4 / 4/3"));}
    @Test public void testCheckpoint3_DivisionBasic2() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "2_1/4", FracCalc.produceAnswer("3/2 / 2/3"));}
    @Test public void testCheckpoint3_DivisionWithNegatives5() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "-2_6/7", FracCalc.produceAnswer("-20 / 7"));}
    @Test public void testCheckpoint3_DivisionWithNegatives6() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "1_13/32", FracCalc.produceAnswer("-3_3/4 / -2_2/3"));}
    @Test public void testCheckpoint3_DivisionWithZero5() { FracCalcTestALL.assertForEarlyCheckpoints(null, null, "0", FracCalc.produceAnswer("0 / 46/27"));}
    @Test public void testCheckpoint3_DivisionWithZero6() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "0", FracCalc.produceAnswer("0/24 / 1/46"));}
    @Test public void testCheckpoint3_DivisionCombined2() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "-2_2/3", FracCalc.produceAnswer("16/4 / -3/2"));}
    @Test public void testCheckpoint3_DivisionCombined3() {FracCalcTestALL.assertForEarlyCheckpoints(null, null, "6_661/5520", FracCalc.produceAnswer("-38_3/72 / -4_82/37"));}

    public static void main(String[] args){
    	
    	Scanner userInput = new Scanner(System.in);
    	System.out.println("Enter your operation.");
    	String expression = userInput.nextLine();
    	while (expression!=("quit")){
    		
    		String answer = produceAnswer(expression);
    		System.out.println(answer);
    		System.out.println("Enter your operation.");
    		expression = userInput.nextLine();
    	}
    	
    }
    
    public static String produceAnswer(String input){
    	
    	String firstOperand = new String();
		String operator = new String();
		String secondOperand = new String();
		int firstSpace = input.indexOf(" ");
    	int secondSpace = input.indexOf(" ", firstSpace+1);
    	operator = input.substring(firstSpace+1, secondSpace);
    	firstOperand = input.substring(0, firstSpace);
    	secondOperand = input.substring(secondSpace+1, input.length());
    	
    	String answer;
    	boolean negativeSign;
    	if(input.substring(0,1).equals("-")){
    		negativeSign = true;
    	}else{
    		negativeSign = false;
    	}

	
		if(operator.equals("+")){
			answer = addFrac(parseOperand(firstOperand, secondOperand),negativeSign);
		}else if(operator.equals("-")){
			answer = subtractFrac(parseOperand(firstOperand, secondOperand),negativeSign);
		}else if(operator.equals("*")){
			answer = multiplyFrac(parseOperand(firstOperand, secondOperand),negativeSign);
		}else if(operator.equals("/")){
			answer = divideFrac(parseOperand(firstOperand, secondOperand),negativeSign);
		}else{
			answer = "Please check your expression";
		}
		
	
	    return answer;
}

   
    
    //checkpoint 3:
    public static int[] parseOperand(String firstOperand, String secondOperand){
    	int[] parseOfTwoOperands = new int[4];
    	//firstOperand
    	int[] parseOfFirst = new int[3];
    	if(firstOperand.indexOf("_")>0){
    		//mixed fraction
    		parseOfFirst[0] = Integer.parseInt(firstOperand.substring(0,firstOperand.indexOf("_")));
    		parseOfFirst[1] = Integer.parseInt(firstOperand.substring(firstOperand.indexOf("_")+1,firstOperand.indexOf("/")));
    		parseOfFirst[2] = Integer.parseInt(firstOperand.substring(firstOperand.indexOf("/")+1));
    	}else if(firstOperand.indexOf("/")<0){
    		//integers
    		parseOfFirst[0] = Integer.parseInt(firstOperand);
    		parseOfFirst[1] = 0;
    	    parseOfFirst[2] = 1;
    	}else{
    		//improperFraction
    		parseOfFirst[0] = 0;
    		parseOfFirst[1] = Integer.parseInt(firstOperand.substring(0,firstOperand.indexOf("/")));
    		parseOfFirst[2] = Integer.parseInt(firstOperand.substring(firstOperand.indexOf("/")+1));
    	}
    	parseOfTwoOperands[0] = (parseOfFirst[0]*parseOfFirst[2]) + parseOfFirst[1];
    	parseOfTwoOperands[1] = parseOfFirst[2];
    	
    	//secondOperand
    	//firstOperand
    	int[] parseOfSecond = new int[3];
    	if(firstOperand.indexOf("_")>0){
    		//mixed fraction
    		parseOfSecond[0] = Integer.parseInt(secondOperand.substring(0,secondOperand.indexOf("_")));
    		parseOfSecond[1] = Integer.parseInt(secondOperand.substring(secondOperand.indexOf("_")+1,secondOperand.indexOf("/")));
    		parseOfSecond[2] = Integer.parseInt(secondOperand.substring(secondOperand.indexOf("/")+1));
    	}else if(firstOperand.indexOf("/")<0){
    		//integers
    		parseOfSecond[0] = Integer.parseInt(secondOperand);
    		parseOfSecond[1] = 0;
    		parseOfSecond[2] = 1;
    	}else{
    		//improperFraction
    		parseOfSecond[0] = 0;
    		parseOfSecond[1] = Integer.parseInt(secondOperand.substring(0,secondOperand.indexOf("/")));
    		parseOfSecond[2] = Integer.parseInt(secondOperand.substring(secondOperand.indexOf("/")+1));
    	}
    	parseOfTwoOperands[2] = (parseOfSecond[0]*parseOfSecond[2])+ parseOfSecond[1];
    	parseOfTwoOperands[3] = parseOfSecond[2];
    	
    	return parseOfTwoOperands;
    	
    }
    
    
    
    public static String addFrac(int[] parseOfTwoOperands, boolean negativeSign){
    	int numeratorOne = parseOfTwoOperands[0];
    	int denominatorOne = parseOfTwoOperands[1];
    	int numeratorTwo = parseOfTwoOperands[2];
    	int denominatorTwo = parseOfTwoOperands[3];
    	
    	String answer = Calculate.toMixedNum(numeratorOne*denominatorTwo+numeratorTwo*denominatorOne,denominatorOne*denominatorTwo);
    
    	
    	return answer;
    	
    }
    
    public static String subtractFrac(int[] parseOfTwoOperands, boolean negativeSign){
    	int numeratorOne = parseOfTwoOperands[0];
    	int denominatorOne = parseOfTwoOperands[1];
    	int numeratorTwo = parseOfTwoOperands[2];
    	int denominatorTwo = parseOfTwoOperands[3];
    	
    	String answer = Calculate.toMixedNum(numeratorOne*denominatorTwo+numeratorTwo*denominatorOne, denominatorOne*denominatorTwo);
   
    	return answer;
    }
    
    public static String multiplyFrac(int[] parseOfTwoOperands, boolean negativeSign){
    	int numeratorOne = parseOfTwoOperands[0];
    	int denominatorOne = parseOfTwoOperands[1];
    	int numeratorTwo = parseOfTwoOperands[2];
    	int denominatorTwo = parseOfTwoOperands[3];
        
        String answer = Calculate.toMixedNum(numeratorOne*numeratorTwo,denominatorOne*denominatorTwo);
        
        
        return answer;
    }
    
    public static String divideFrac(int[] parseOfTwoOperands, boolean negativeSign){
    	int numeratorOne = parseOfTwoOperands[0];
    	int denominatorOne = parseOfTwoOperands[1];
    	int numeratorTwo = parseOfTwoOperands[2];
    	int denominatorTwo = parseOfTwoOperands[3];
    	
    	String answer = Calculate.toMixedNum(numeratorOne*denominatorTwo, numeratorTwo*denominatorOne);
    	
  
    	return answer;
    }
    
    
    

}
