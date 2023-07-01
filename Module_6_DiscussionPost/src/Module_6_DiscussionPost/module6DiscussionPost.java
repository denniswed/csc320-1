package Module_6_DiscussionPost;

import java.util.Scanner;

public class module6DiscussionPost {
	
	double divideAbyB(double numA, double numB) {
		return numA/numB;
	}
	
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		double numberA;
		double numberB;
		
		System.out.println("Enter a number:");
		numberA = userInput.nextDouble();
		System.out.println("Enter another number:");
		numberB = userInput.nextDouble();
		
		System.out.println("A divided by B = " + divideAbyB(numberA, numberB));
				
	}

}
