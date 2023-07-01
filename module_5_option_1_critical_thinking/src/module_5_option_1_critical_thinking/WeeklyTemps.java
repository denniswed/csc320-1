package module_5_option_1_critical_thinking;
/*
 * Option #1: Get Weekly Temperatures
 * Develop a Java program that will store data in the form of daily average
 * temperatures for one week. Store the day and average temperature in two
 * different arraylists. Your program should prompt the user for the day of
 * the week (Monday through Sunday) and display both the day and temperature
 * for each day. If "week" is entered, the output for your program should
 * provide the temperature for each day and the weekly average. Use the looping
 * and decision constructs in combination with the arrays to complete this
 * assignment.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class WeeklyTemps {
	public static void main(String args[]) {
		final int NUM_ELEMENTS = 7;
		Scanner userInput = new Scanner(System.in);
		Scanner userDoubleInput = new Scanner(System.in);
		ArrayList<String> weekDay = new ArrayList<String>();
		ArrayList<Double> averageTemp = new ArrayList<Double>();
		String doWhile = "none";
		
		// initialize for the days of the week
		weekDay.add("Monday");
		weekDay.add("Tuesday");
		weekDay.add("Wednesday");
		weekDay.add("Thursday");
		weekDay.add("Friday");
		weekDay.add("Saturday");
		weekDay.add("Sunday");
		
		//initialize temps to 0 
		int i = 0;
		for (i = 0; i < NUM_ELEMENTS; ++i) {
			averageTemp.add(i,0.0);
		}
		
		do {
			System.out.println("Please type the day to enter the average daily temperature.");
			System.out.println("Monday, M, Tuesday, Tu, Wednesday, W, Thursday, Th, Friday, F,");
			System.out.println("Saturday, Sa, Sunday, Su");
			System.out.println("Type 'week' to see the current list of temps and then the average.");
			System.out.println("Type 'quit' to end input");
			
			String input = userInput.nextLine();
			doWhile = input;
			switch (input) {
				case "Monday":
				case "monday":
				case "M":
				case "m":
					System.out.println("Enter Monday's average temperatue:");
					Double mondayInput = userDoubleInput.nextDouble();
					averageTemp.add(0,mondayInput);
					break;
				case "Tuesday":
				case "tuesday":
				case "Tu":
				case "tu":
					System.out.println("Enter Tuesday's average temperatue:");
					Double tuesdayInput = userDoubleInput.nextDouble();
					averageTemp.add(0,tuesdayInput);
					break;
				case "Wednesday":
				case "wednesday":
				case "W":
				case "w":
					System.out.println("Enter Wednesday's average temperatue:");
					Double wednesdayInput = userDoubleInput.nextDouble();
					averageTemp.add(0,wednesdayInput);
					break;
				case "Thursday":
				case "thursday":
				case "Th":
				case "th":
					System.out.println("Enter Thursday's average temperatue:");
					Double thursdayInput = userDoubleInput.nextDouble();
					averageTemp.add(0,thursdayInput);
					break;
				case "Friday":
				case "friday":
				case "F":
				case "f":
					System.out.println("Enter Friday's average temperatue:");
					Double fridayInput = userDoubleInput.nextDouble();
					averageTemp.add(0,fridayInput);
					break;
				case "Saturday":
				case "saturday":
				case "Sa":
				case "sa":
					System.out.println("Enter Saturday's average temperatue:");
					Double saturdayInput = userDoubleInput.nextDouble();
					averageTemp.add(0,saturdayInput);
					break;
				case "Sunday":
				case "sunday":
				case "Su":
				case "su":
					System.out.println("Enter Sunday's average temperatue:");
					Double sundayInput = userDoubleInput.nextDouble();
					averageTemp.add(0,sundayInput);
					break;
				case "week":
				case "Week":
					int j = 0;
					double weeklyAverage = 0;
					for (j = 0; j < NUM_ELEMENTS; ++j) {
						weeklyAverage += averageTemp.get(j);
					}
					weeklyAverage = weeklyAverage/NUM_ELEMENTS;
					 
					System.out.print("Average weekly temp: ");
					System.out.printf("%.4f%n", weeklyAverage);
					break;
				default:
					System.out.println("Invalid input.");
			}
			System.out.print("	Monday:		");
			System.out.println(averageTemp.get(0));
			System.out.print("	Tuesday:	");
			System.out.println(averageTemp.get(1));
			System.out.print("	Wednesday:	");
			System.out.println(averageTemp.get(2));
			System.out.print("	Thursday:	");
			System.out.println(averageTemp.get(3));
			System.out.print("	Friday:		");
			System.out.println(averageTemp.get(4));
			System.out.print("	Saturday:	");
			System.out.println(averageTemp.get(5));
			System.out.print("	Sunday:		");
			System.out.println(averageTemp.get(6));

		} while (!doWhile.equalsIgnoreCase("quit"));
	}
}
