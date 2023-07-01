package module_8_option_1_portfolio_project;

import java.io.StringWriter;
import java.io.PrintWriter;

public class Automobile {
	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	
	Automobile(String initMake, String initModel, String initColor, int initYear, int initMileage) {
		this.make = initMake;
		this.model = initModel;
		this.color = initColor;
		this.year = initYear;
		this.mileage = initMileage;
		
	}
	
	public void setAutoMake(String autoMake) {
		this.make = autoMake;
	}
	
	public void setAutoModel(String autoModel) {
		this.model = autoModel;
	}
	
	public void setAutoColor(String autoColor) {
		this.color = autoColor;
	}
	
	public void setAutoYear(int autoYear) throws Exception{
		if (autoYear < 1900 || autoYear > 2025) {
			throw new Exception("Invalid year.");
		} else {
			this.year = autoYear;
		}
	}
	
	public void setAutoMileage(int autoMileage) throws Exception{
		if (autoMileage < 0) {
			throw new Exception("Mileage must be greater than 0.");
		} else {
			this.mileage = autoMileage;
		}
	}
	
	public void displayAutomobile() {
		String[] listCar;
		listCar = this.listAutomobile();
		
		System.out.println("Your automobile info:");
		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				System.out.print("Make:  ");
			} else if (i == 1) {
				System.out.print("Model: ");
			} else if (i == 2) {
				System.out.print("Color: ");
			} else if (i == 3) {
				System.out.print("Year:  ");
			} else if (i == 4) {
				System.out.print("Miles: ");
			}
			System.out.println(listCar[i]);
		}
	}
	
	private String[] listAutomobile() {
		StringWriter yearToString = new StringWriter();
		PrintWriter yearOSS = new PrintWriter(yearToString);
		StringWriter mileageToString = new StringWriter();
		PrintWriter mileageOSS = new PrintWriter(mileageToString);
		String yearString;
		String mileageString;
		
		yearOSS.print(year);
		yearString = yearToString.toString();
		
		mileageOSS.print(mileage);
		mileageString = mileageToString.toString();
				
		return new String[] {make,model,color,yearString,mileageString};
	}
}


