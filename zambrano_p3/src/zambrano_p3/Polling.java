package zambrano_p3;

import java.util.Scanner;

public class Polling {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String[] topics = new String[5];
		String[] highestName = new String[1];
		String[] lowestName = new String[1];
		int[][] responses = new int[5][10];
		double[] avg = new double[5];
		int[] temp = new int[5];
		int[] max = new int[5];
		int[] low = new int[5];
		int userRating, i, j, counter = 1, highest = -1, lowest = 0;
		char userInput;
		
		topics[0] = "Bioshock";
		topics[1] = "Oblivion";
		topics[2] = "Fallout 4";
		topics[3] = "Far Cry 5";
		topics[4] = "L.A. Noire";
		
		System.out.println("Would you like to participate in this survey? Enter Y/N:");
		userInput = scnr.next().charAt(0);
		
		while (userInput == 'Y') {
			
			for (i = 0; i < topics.length; i++) {
				
				System.out.println("How would you rate the video game " + topics[i] + " from 1 to 10?");
				userRating = scnr.nextInt();
				responses[i][userRating - 1] += 1;
				
				temp[i] += userRating;				//used to help calculate average, highest and lowest points
				avg[i] = (double)temp[i] / counter; //calculate average

				max[i] = temp[i];	//keeping track of the total points for each topic to later calculate the highest
				low[i] = temp[i];	//keeping track of the total points for each topic to later calculate the lowest
				
			} //end of for loop
			
			System.out.println("Would you like to participate in this survey? Enter Y/N:");
			userInput = scnr.next().charAt(0);
			
			//update the counter to keep track of the number of people who participated
			
			if (userInput == 'Y') {
				
				counter++;
				
			} //end of if statement
					
		} //end of while loop
		
		//printing all of the results in a table
		
		System.out.println("\t\t1 2 3 4 5 6 7 8 9 10 | Avg");
		System.out.println("\t\t__________________________");
		
		for (i = 0; i < topics.length; i++) {
			
			System.out.print(topics[i] + "\t");
			
			for (j = 0; j < 10; j++) {
				
				System.out.print(responses[i][j] + " ");
				
			} //end of nested for loop
			
			System.out.printf(" | %.2f", avg[i]);
			System.out.println("");
			
		} // end of for loop
		
		//calculating the highest and lowest rated games
		
		for (i = 0; i < 5; i++) {
			
			if (max[i] > highest) {
				
				highest = max[i];
				highestName[0] = topics[i];
				
			} //end of if
			
			lowest = low[0];
			
			if (low[i] < lowest) {
				
				lowest = low[i];
				lowestName[0] = topics[i];
				
			} //end of if
				
		} //end of for loop
		
		System.out.println("\nThe video game that received the highest rating is " + highestName[0] + " with " + highest + " points.");
		System.out.println("\nThe video game that received the lowest rating is " + lowestName[0] + " with " + lowest + " points.");
		
		scnr.close();
		
	} //end of main

}
