package module_4_option_1_critical_thinking;

/*
Write a program that utilizes a while-loop to read a set of five floating-point
 values from user input. Include code to prevent an endless loop. Ask the user 
 to enter the values, then print the following data:

Total
Average
Maximum
Minimum
Interest on total at 20%
*/

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	 public static void main(String args[]) {
		 Scanner userInput = new Scanner(System.in);
		 double[] userValues = {0,0,0,0,0};
		 double totalValue;
		 double tempInput;
		 int counter;
		 
		 System.out.println("Please provide 5 numbers, select 'enter' after each.");
		 System.out.println("Numbers need to be greater than 0!");
		 counter = 0;
		 tempInput = 0;
		 while (counter < 5) {
			 int innerCounter = 0;
			 while (innerCounter < 3) {
				 System.out.println("Number " + (counter + 1) + ":");
				 tempInput = userInput.nextDouble();
				 if (tempInput > 0) {
					 userValues[counter] = tempInput;
					 ++counter;
					 innerCounter = 4;
				 } else {
					 System.out.println("Please enter a number greater than zero. You have two more tries");
					 ++innerCounter;
				 }
			
			 }
			 if (innerCounter == 3) {
				 System.out.println("You ran out of tries.");
				 counter = -1;
				 break;
			 }
		 }
		 if (counter == -1) {
			 System.out.println("Please try again using postive numbers!");
		 } else {
			 Arrays.sort(userValues);
			 totalValue = 0;
			 
			 for (int i = 0; i < userValues.length; ++i) {
				 totalValue += userValues[i];
				 //System.out.print(userValues[i] + ":");
			 }
			 System.out.print("Total:        ");
			 System.out.printf("%.4f%n",totalValue);
			 System.out.print("Average:      "); 
			 System.out.printf("%.4f%n",(totalValue/(userValues.length)));
			 System.out.println("Max:          " + userValues[userValues.length -1]);
			 System.out.println("Minimum:      " + userValues[0]);
			 System.out.print("20% interest: ");
			 System.out.printf("%.4f%n",totalValue*.2);
		 }
		 userInput.close();
	 }
}
