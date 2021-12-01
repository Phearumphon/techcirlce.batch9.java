package day07_switchStatement;

public class MultiBranchIfstatement {

	public static void main(String[] args) {
		
		
		int score = 67;
		char grade;
		
		
		if (score >= 0 && score <=100) {
			
			if (score >= 90 && score <=100) {
				grade = 'A';
				
			}else if (score >= 80 && score <90) {
				grade = 'B';

			}else if (score >= 70 && score < 80) {
				grade = 'C';

			}else if (score >= 60 && score < 70) {
				grade = 'D';

			}else {
				grade = 'F';

			}

			System.out.println("Your score is "+ score);
			System.out.println("Your grade is "+ grade);
			
		}else {
			System.out.println("Invalid score!");
		}
		
		
		
		
		

	}

}