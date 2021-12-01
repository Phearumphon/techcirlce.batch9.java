package day08_Loops;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		//Write a program to accept number between 1 to 12, 
		// and print name of the month base on the input using switch statement. 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter month:");
		int month = scanner.nextInt();
		String output = "";
		
		switch (month) {
			case 1:
				output = "January";
				break;
			case 2:
				output = "February";
				break;
			case 3:
				output = "March";
				break;
			case 4:
				output = "April";
				break;
			case 5:
				output = "May";
				break;
			case 6:
				output = "June";
				break;
			case 7:
				output = "July";
				break; 
			case 8:
				output = "August";
				break;
			case 9:
				output = "September";
				break;
			case 10:
				output = "October";
				break;
			case 11:
				output = "November";
				break;
			case 12:
				output = "December";	
                break;
			
			default: output = "invalid month!";
		}
		
		System.out.println("You entered " + output);
		
		scanner.close();
		
	}
}



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		