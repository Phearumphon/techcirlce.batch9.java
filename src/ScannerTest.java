import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
//		int score =71; 
//	   	char grade =' ';
				Scanner scan=new Scanner(System.in); 
				System.out.println("Plese in enter your score");
				int score = scan.nextInt(); 
			char grade=' '; 
			if (score>=0 && score<=100) {
						
						if(score>=90 && score<=100) {
							grade = 'A'; 
					}if(score>=80 && score<90) {
						   grade ='B';   
					}if (score>=70 && score<80) {
						  grade ='C';
					}if (score>=60 && score<70) {
						 grade ='D' ;
					}if (score>=50 && score<60) {
						grade ='F'; 
					}	System.out.println("Your Score is   " +  score+",  grade is" +grade);
					}else {
							System.out.println("Invalid Score");
					}
//			scan.close(); 
						}
	}

