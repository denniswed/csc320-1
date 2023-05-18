package module_1_option_1_critical_thinking;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String firstName, lastName, streetAddress, city, zipcode;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please provide your first Name:");
		firstName = userInput.nextLine();
		
		System.out.println("Please provide your last Name:");
		lastName = userInput.nextLine();
		
		System.out.println("Please provide your street address:");
		streetAddress = userInput.nextLine();
		
		System.out.println("Please provide your city:");
		city = userInput.nextLine();
		
		System.out.println("Please provide your zipcode:");
		zipcode = userInput.nextLine();
		
		System.out.println("Hello " + firstName + "!");
		System.out.println("Your last name is: " + lastName);
		System.out.println("You live on: " + streetAddress);
		System.out.println("In the city of: " + city);
		System.out.println("With a zip code of: " + zipcode);
	}

}
