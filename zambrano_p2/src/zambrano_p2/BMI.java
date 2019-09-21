package zambrano_p2;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		int userInput;
		double pounds, inches, kilo, meters, BMI;
		
		System.out.println("Enter 1 to use pounds and inches");
		System.out.println("Enter 2 to use kilograms and meters");
		
		Scanner scnr = new Scanner(System.in);
		userInput = scnr.nextInt();
		
		while ((userInput != 1) && (userInput != 2)) {
			
			System.out.println("That's not a valid choice\n");
			
			System.out.println("Enter 1 to use pounds and inches");
			System.out.println("Enter 2 to use kilograms and meters");
			
			userInput = scnr.nextInt();
			
		}
		
		if (userInput == 1) {
			
			System.out.println("Enter your weight in pounds:");
			pounds = scnr.nextDouble();
			
			System.out.println("Enter your height in inches:");
			inches = scnr.nextDouble();
			
			BMI = (703 * pounds) / (inches * inches);
			
			System.out.printf("\nYour BMI is %.2f\n\n", BMI);
			
			System.out.println("\t\t\tBMI");
			System.out.println("Underweight \t\t18.5");
			System.out.println("Normal \t\t\t18.5-24.9");
			System.out.println("Overweight \t\t25.0-29.9");
			System.out.println("Obesity \t\t30.0 and above");
			
		}
		
		else {
			
			System.out.println("Enter your weight in kilograms:");
			kilo = scnr.nextDouble();
			
			System.out.println("Enter your height in meters:");
			meters = scnr.nextDouble();
			
			BMI = (703 * kilo) / (meters * meters);
			
			System.out.printf("\nYour BMI is %.2f\n\n", BMI);
			
			System.out.println("\t\t\tBMI");
			System.out.println("Underweight \t\t18.5");
			System.out.println("Normal \t\t\t18.5-24.9");
			System.out.println("Overweight \t\t25.0-29.9");
			System.out.println("Obesity \t\t30.0 and above");
			
		}
		
		scnr.close();

	}

}
