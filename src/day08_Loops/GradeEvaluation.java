package day08_Loops;

public class GradeEvaluation {

	public static void main(String[] args) {
		char grade = 'A';
		  switch(grade) {
		  	case 'A':
		  	
		  System.out.println("PASS");
		  break; 
		  	case 'B':
		  		
		    System.out.println("PASS");
		  break;
		  	case 'C':
		  System.out.println("PASS");
		  break;
		  	case 'D':
		  		 System.out.println("PASS");
		  		 break;
		  	case 'I' :  
		  		 System.out.println("INCOMPLETE");
		  		 break; 
		  	case 'W': 
		  	 System.out.println("WITHDRAW");
		  	 break; 
		  	  default:
		  System.out.println("Fail");
		  }

		
		
	}

}
