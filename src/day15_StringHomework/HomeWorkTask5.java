package day15_StringHomework;

import java.util.Scanner;

public class HomeWorkTask5 {

	public static void main(String[] args) {
//		* Task: 1. Ask user to enter two words. Print first word without its first
//        * character then print the second word without its first character. Input:
//        * apple banana Output: ppleanana

//		String word1="apple"; 
//		String word2="banana"; 
//		Scanner scan = new Scanner (System.in); 
//		System.out.println("Please enter first word  or second word !" );
//		String word1=scan.next(); 
//		 System.out.println(word1.substring(1));
//	     Scanner scan2= new Scanner(System.in); 
//		 String word2=scan2.next(); 
//		 System.out.println(word2.substring(1));
//		 scan.close();
//		 scan2.close();
		 String word1="Apple"; 
		 String word2 ="Banana"; 
		 System.out.println(word1.substring(1));
		 System.out.println(word2.substring(1));
		 
		 String word3 =word1.substring(1).concat(word2.substring(1));
		 String word4=word1.substring(1)+word2.substring(1);
		 System.out.println(word3);
		 System.out.println(word4);
		 
}

}
