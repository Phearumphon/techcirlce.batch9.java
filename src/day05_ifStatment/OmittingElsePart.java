package day05_ifStatment;

public class OmittingElsePart {

	public static void main(String[] args) {
		 
		int count = 3; 
		if(count<2) {
			System.out.println("line number 11"); 
		}
		
		 System.out.println("I'm here");
		 
		 if(count>2) {
			 System.out.println(1);
			 System.out.println(2);
			 System.out.println(3);
			 System.out.println(4);
			 System.out.println(5);
			  }
		 
		 
		 //  /* 
		// 1. write a program that can check if the given number is odd or even (oddEven)
		 
		 //	Ex:  
//		 			number =100
//		 					output: 
//		 						100 is ever number
//		 						
//		 			number = 101
//		 					 output: 
//		 						 101 is odd number 
//		 						 
		 						 
		 						 int number=100; 
		 						 if (number %2==0) {
		 							 System.out.println(number + "is even number");
		 							 
		 							
		 						 }else {
		 							 System.out.println(number + "is odd number");
		 						 }
		 								 
		 
		 
	}
	

}
