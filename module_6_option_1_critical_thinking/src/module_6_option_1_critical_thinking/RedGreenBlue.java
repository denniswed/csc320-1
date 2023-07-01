package module_6_option_1_critical_thinking;
/*
 * Option #1: Create a Method with a Scanner Input
 * Write a program with a method that will accept as input a scanner object.
 * Prompt the user for three individual string input values (e.g., Red, Blue,
 * and Green). Use Try..Catch error handling. The method should print the
 * contents of the user input and return a string value to the calling method
 * indicating "Success" or "Failure" based on the program flow through the
 * try..catch error handling (see Chapter 6 in the text). Print the return
 * message. Call the method from the main program to demonstrate its 
 * functionality.

 */
import java.util.Scanner;

public class RedGreenBlue {
	public static String isRedGreenBlue(Scanner userInput, int colorType) {
		// colorType 0 = red, 1 = green, 2 = blue
		String color;
		String returnMessage;
		
		try {
			color = userInput.nextLine();
			System.out.println("You typed: " + color);
			if (colorType == 0) {
				if (color.compareToIgnoreCase("red") != 0) {
					throw new Exception("This is not 'red'!");
				} else {
					returnMessage = "Success";
				}
			} else if (colorType == 1){
				if (color.compareToIgnoreCase("green") != 0) {
					throw new Exception("This is not 'green'!");
				} else {
					returnMessage = "Success";
				}
			} else if (colorType == 2) {
				if (color.compareToIgnoreCase("blue") != 0) {
					throw new Exception("This is not 'blue'!");
				} else {
					returnMessage = "Success";
				}
			} else {
				throw new Exception("Invalid color type requested.");
			}
		} catch (Exception except) {
			returnMessage = "Failure! " + except.getMessage();
		}
		return returnMessage;
	}
	
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		String color;
		int counter;
		String userColor;

		System.out.println("This will test your ability to type colors.");
		counter = 0;
		do {
			switch (counter) {
				case 0:
					color = "red";
					break;
				case 1:
					color = "green";
					break;
				case 2:
					color = "blue";
					break;
				default:
					color = "none";
					break;
			}
			System.out.println("Please type the word " + color + ".");
			userColor = isRedGreenBlue(userInput,counter);
			System.out.println(userColor);
			System.out.println();
			counter++;
		} while (counter < 3);
		System.out.println("Thank you for your time.");
	}
}