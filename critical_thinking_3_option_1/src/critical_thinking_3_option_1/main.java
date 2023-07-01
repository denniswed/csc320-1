package critical_thinking_3_option_1;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int customerWeeklyIncome;
		double taxRate;
		int weeklyTaxAmount;
		
		System.out.println("To determine tax withholding,");
		System.out.println("Please enter your weekly income:");
		customerWeeklyIncome = userInput.nextInt();
		
		if (customerWeeklyIncome < 0) {
			System.out.println("You cannot have a negative weekly income!");
			System.out.println("Setting weekly income to $0.00");
			taxRate = 0;
			customerWeeklyIncome = 0;
		}
		else if (customerWeeklyIncome < 500) {
			taxRate = 0.10;
		}
		else if (customerWeeklyIncome < 1500) {
			taxRate = 0.15;
		}
		else if (customerWeeklyIncome < 2500) {
			taxRate = 0.20;
		}
		else {
			taxRate = 0.30;
		}
		
		weeklyTaxAmount = (int)(customerWeeklyIncome * taxRate);
		System.out.println("With a weekly salary of $" + customerWeeklyIncome + ",");
		System.out.println("Your tax rate is " + (int)(taxRate * 100) + "%.");
		System.out.println("This means your weekly tax withholding is $" + weeklyTaxAmount + ".");
		
		
	}

}
