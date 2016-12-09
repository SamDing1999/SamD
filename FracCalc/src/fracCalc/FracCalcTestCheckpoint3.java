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

    public static void main (String[] args){
		System.out.println("Please put in an expression");
		Scanner input  = new Scanner(System.in);
		String userInput = input.nextLine();
		while (userInput.equals("quit")!= true){
			String answer = produceAnswer(userInput);
			System.out.println(answer);
			System.out.println("please type next operation");
			userInput = input.nextLine();
		}
		System.out.println("Please press \"RUN\" to start over");
	}


	public static String produceAnswer(String Input){
		String[] splitBySpaces = Input.split(" ");
		String operator= splitBySpaces[1];
		int[] firstOperand= parseOperand(splitBySpaces[0]);//store the first  operand
		int[] secondOperand= parseOperand(splitBySpaces[2]);//store the second operand
		int[] firstImproperOperand=toImproperFrac(firstOperand);
		int[] secondImproperOperand=toImproperFrac(secondOperand);
		String answer;
		if ( operator.equals("+") ){
			answer = toMixedFrac(addFrac(firstImproperOperand,secondImproperOperand));
		}else if(operator.equals("-")){
			answer = toMixedFrac((subtractFrac(firstImproperOperand,secondImproperOperand)));
		}else if(operator.equals("*")){
			answer = toMixedFrac(multiplyFrac(firstImproperOperand,secondImproperOperand));
		}else if(operator.equals("/")){
			answer = toMixedFrac(divideFrac(firstImproperOperand,secondImproperOperand));	
		}else{
			answer = "Please check your expression";
		}

		return answer;
	}
	
	public static int[] parseOperand(String operand){
		String[] partsOfOperand=new String [3];
		if (operand.indexOf("_")<0 && operand.indexOf("/")<0) {
			//integers
			partsOfOperand[0] = operand;
			partsOfOperand[1] = "0";
			partsOfOperand[2] = "1";
		}else if(operand.indexOf("_")<0 && operand.indexOf("/")>0 ){
			//improper fraction
			partsOfOperand[0] = "0";
			partsOfOperand[1] = operand.substring(0, operand.indexOf("/"));
			partsOfOperand[2] = operand.substring(operand.indexOf("/")+1);
		}else if(operand.indexOf("_")>0 && operand.indexOf("/")>0){
			//Mixed fraction
			partsOfOperand[0] = operand.substring(0,operand.indexOf("_"));
			partsOfOperand[1]=operand.substring(operand.indexOf("_")+1,operand.indexOf("/"));
			partsOfOperand[2] = operand.substring(operand.indexOf("/")+1);
		}
			int[] parseOfOperand=new int [3];
			for(int i = 0; i < 3; i++){
				parseOfOperand[i]= Integer.parseInt(partsOfOperand[i]);
			}
		return parseOfOperand;
	}



	public static int[] toImproperFrac (int[] operands){
		int[] improperFrac=new int [2];
		if(operands[0]<0){
			improperFrac[0] = (operands[0]*operands[2])+(operands[1]*-1)	;
			improperFrac[1] = operands[2];
		}else{
			improperFrac[0] =((operands[0]*operands[2])+operands[1]);
			improperFrac[1]=operands[2];
		}
		return improperFrac;
	}
				
	public static String toMixedFrac(int[] pq){
		String answer;
		int GCF = gcf(pq[0],pq[1]);
		if(GCF!=1){
			pq[0] = pq[0]/GCF;
			pq[1] = pq[1]/GCF;
		}
		if(pq[1]<0){
				pq[1]=Calculate.absValue(pq[1]);
				pq[0]=pq[0]*-1;
		}
		int coefficient = pq[0]/pq[1];
	  	int remainder = pq[0] % pq[1];
	 	if (coefficient<0){
	  		if(remainder==0 && pq[1]==1){
				answer = (Integer.toString(coefficient));
	 		}else if(remainder==0 && pq[1]==-1){
	  			answer = (Integer.toString(coefficient));
	  		}else{
		  		 answer = (coefficient + "_" + Calculate.absValue(remainder) + "/" + Calculate.absValue(pq[1]));
			}
		}else if(pq[0]%pq[1]==0){
			answer=(coefficient+"");		
		}else if(coefficient==0){			
			if(remainder<0 && pq[1]<0){
				int newNum = remainder*-1;
		  		int newDenom = pq[1]*-1;
				answer=(newNum + "/" + newDenom);
			}else{
				answer = (remainder + "/" + pq[1]);
	  		}
		}else if(remainder<0 && pq[1]<0){
 	    	int newNum = remainder*-1;
 			int newDenom = pq[1]*-1;
			answer=((coefficient + "_" + newNum) + "/" + newDenom);
		}else{
			answer = ((coefficient + "_" + remainder) + "/" + pq[1]);
		}
					    		
	   	return answer;
	}	
	
	//A method that finds the greatest common factor of two integers
	/**
	 * @param integer
	 * @return integer
	 */
	public static int gcf(int a, int b){
		while(a!=0 && b!=0){
			int c = b;
			b = a%b;
			a = c;
		}
		return Calculate.absValue(a+b);
	}
				
	public static int[] addFrac(int[] firstOperand, int[] secondOperand){ 
		int[] answer =new int[2];
		int firstNumerator = firstOperand[0];
		int firstDenominator = firstOperand[1];
		int secondNumerator = secondOperand[0];
		int secondDenominator = secondOperand[1];
		answer[0] = secondDenominator * firstNumerator + firstDenominator * secondNumerator;
		answer[1] = firstDenominator * secondDenominator;
		return answer;
	}
	public static int[] subtractFrac(int[] firstOperand, int[] secondOperand){ 
		int[] answer =new int[2];
		int firstNumerator = firstOperand[0];
		int firstDenominator = firstOperand[1];
		int secondNumerator = secondOperand[0];
		int secondDenominator = secondOperand[1];
		answer[0] = secondDenominator * firstNumerator - firstDenominator * secondNumerator;
		answer[1] = firstDenominator * secondDenominator;
		return answer;
	}
	public static int[] multiplyFrac(int[] firstOperand, int[] secondOperand){ 
		int[] answer =new int[2];
		int firstNumerator = firstOperand[0];
		int firstDenominator = firstOperand[1];
		int secondNumerator = secondOperand[0];
		int secondDenominator = secondOperand[1];
		answer[0] = firstNumerator * secondNumerator;
		answer[1] = firstDenominator * secondDenominator;
		return answer;
	}
	public static int[] divideFrac(int[] firstOperand, int[] secondOperand){ 
		int[] answer =new int[2];
		int firstNumerator = firstOperand[0];
		int firstDenominator = firstOperand[1];
		int secondNumerator = secondOperand[0];
		int secondDenominator = secondOperand[1];
		answer[0] =firstNumerator * secondDenominator;
		answer[1] = firstDenominator * secondNumerator;
		return answer;
	}
}
