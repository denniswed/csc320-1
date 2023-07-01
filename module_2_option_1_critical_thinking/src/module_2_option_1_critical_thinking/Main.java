package module_2_option_1_critical_thinking;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		final DecimalFormat df = new DecimalFormat("0.00");
		String carModel;
		String carMake;
		int carYear;
		Double carOdometerStart;
		Double carOdometerEnd;
		Double carGallonsUsed;
		Double milesPerGallon;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter the car make/brand:");
		carMake = userInput.nextLine();
		
		System.out.println("Please enter the car model:");
		carModel = userInput.nextLine();
		
		System.out.println("Please enter the car year:");
		carYear = userInput.nextInt();
		
		System.out.println("Please enter the car's Odometer miles");
		System.out.println(" at the start of trip with a full tank of gas:");
		carOdometerStart = userInput.nextDouble();

		System.out.println("Please enter the gallons of gas you");
		System.out.println(" put in the car at the end of the trip:");
		carGallonsUsed = userInput.nextDouble();

		System.out.println("Please enter the car's Odometer miles");
		System.out.println(" when you put in the gas:");
		carOdometerEnd = userInput.nextDouble();
		
		System.out.println("You car's info:");
		System.out.println("            Make: " + carMake);
		System.out.println("           Model: " + carModel);
		System.out.println("            Year: " + carYear);
		System.out.println("Trip start miles: " + carOdometerStart);
		System.out.println("  Trip end miles: " + carOdometerEnd);
		milesPerGallon = (carOdometerEnd - carOdometerStart)/carGallonsUsed;
		System.out.println(" Approximate MPG: " + df.format(milesPerGallon));
		
		userInput.close();
		
		int Value1 = 2;
		int Value2 = 3;
		System.out.print(Value1 > Value2);
		
	}

}
