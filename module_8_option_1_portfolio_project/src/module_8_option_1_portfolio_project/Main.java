package module_8_option_1_portfolio_project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String autoMake;
		String autoModel;
		String autoColor;
		int autoYear;
		int autoMileage;
		
		System.out.println("Enter automobile information.");
		System.out.println("Make: ");
		autoMake = userInput.nextline();
		
		Automobile myCar = new Automobile("Buick","Electra","Orange",1972,178234);
		myCar.displayAutomobile();
		

		}

	}

