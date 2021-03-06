/*
 * 
 * Sam Ding
 * Date : 09/30/2016
 *
 *A program does the following:
 *1)Accepts as user input a string of numbers
 *2)Prints the smallest and largest of all the numbers supplied by the user
 *3)Prints the sum of all the even numbers the user typed, along with the largest even number typed
 *
 *
 */

import java.util.*;

public class ProcessingNumbers {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		//The largest of all numbers the user typed
		int max = 0;
		//The smallest of all numbers the user typed
		int min = 0;
		//The sum of all the even numbers the user typed
		int sum = 0;
		//The largest of all the even numbers the user typed
		int maxEven = 0;
		System.out.println("How many numbers would you like? ");
		int terms = userInput.nextInt();
		
		System.out.println("Enter a String of numbers seperated by spaces: ");
		for(int i = 1; i <= terms; i++){
			int nextNum = userInput.nextInt();
			if(i == 1){
				min = nextNum;
				max = nextNum;
			}else{
				if(nextNum<min){
					min = nextNum;
				}else if(nextNum>max){
					max = nextNum;
				}
			}
			if(nextNum%2==0){
				if(nextNum>maxEven){
					maxEven = nextNum;
				}
				sum += nextNum;
			}
		}
		
		System.out.println("The largest number is: " + max);
		System.out.println("The smallest number is:  " + min);
		System.out.println("The sum of all the even numbers is: " + sum);
		System.out.println("The largest even number is: " + maxEven);
		
	}

}
