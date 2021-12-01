package day15_StringHomework;

public class HomeWorkTask7 {
public static void main(String[] args) {
//	Find the middle character of a string 
//	Write a Java program to find the middle character of a string.
//	 If the length of the string is odd there will be one middle character. 
//	 If the length of the string is even there will be 2 middle characters. 
//	 Input: abcde 
//	 output:c 
//	 intput car11car 
//	 output 11
	
	String input = "abcde"; 
	char middleChar=' ';  
//	System.out.println(input.length());
	if(input.length()%2==1) {
//		System.out.println(input.length()/2);
		int middleCharIndex = input.length()/2; 
		middleChar=input.charAt(middleCharIndex); 
		
	}
	
	System.out.println(middleChar);
	
	
	
	
	
}

}
