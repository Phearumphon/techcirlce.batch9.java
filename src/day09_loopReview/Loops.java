package day09_loopReview;

public class Loops {

	public static void main(String[] args) {
	
		/*
		 * tasks: 
		 * 1. print out the numbers between 0 ~ 100 
		 * 2. print out the numbers between 100 ~ 200 
		 * 3. print out all the odd numbers between 0 ~ 100 
		 * 4. print out all the even numbers between 0 ~ 100 
		 * 5. do 500 push ups
		 */
//		
//		int count =0; 
//		while (count <=100) {
//			System.out.println(count);
//			count ++; 
//				}
//		System.out.println("--------------------------------");
//		for(int a=100 ; a<=200 ; a++) {
//			System.out.println(a);
//			
//			}
//
//		System.out.println("--------------------------------");
//		
//	
////		3 . print out all the odd numbers between 0~100
//		
////		int a=5;
////		
////		System.out.println(a%2);  
////		if (a%2==1) { 
////			System.out.println("odd number");
////		
////		}
//		
//		System.out.println("----------------------------------");
//		for (int i=0; i<=100; i++)
//		if ( i % 2==1) {
//			System.out.println(i);
//		
//		}
		
		// 6. print out all the numbers divisible by 2 or 3 or 5' 
		
		for (int i = 0; i <= 100; i++)
			if (i%2 == 0) {
				System.out.println("Codility");
			}
		
			else if (i%3 == 0) {
			System.out.println("test");
			}
			else if(i%5==0) {
			System.out.println("Coder");}
			
			else {
				System.out.println(i);
	
			
			}
		
		
		
	}

}
