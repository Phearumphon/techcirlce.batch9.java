package day07_switchStatement;

public class SwitchStatement {

	public static void main(String[] args) {
		int day =2; 
		switch(day) {
		case 1: 
		System.out.println("Monday");
		break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
				System.out.println("Wenesday");
				break;
		case 4: 
					System.out.println("Thurday");
					break;
		case 5: 
						System.out.println("Friday");
						break;
		case 6: 
							System.out.println("Saturday");
							break;
		case 7: 
							System.out.println("Sunday");
		break;
		default: 
			System.out.println("Invalid Input");
					
		}
		
		
String name = "Friday";
		
		
		switch (name) {
		case "Monday":
			System.out.println(1);
			break;
		case "Tuesday":
			System.out.println(2);
			break;
		case "Wednesday":
			System.out.println(3);
			break;
		case "Thursday":
			System.out.println(4);
			break;
		case "Friday":
			System.out.println(5);
			System.out.println("You can put more statement here");
			break;
		case "Saturday":
			System.out.println(6);
			break;
		case "Sunday":
			System.out.println(7);
			break;
	
		default:
			System.out.println("Invalid input");
			break;
		}
		
		
	}
}
