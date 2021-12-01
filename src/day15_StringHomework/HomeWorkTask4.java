package day15_StringHomework;

public class HomeWorkTask4 {

	public static void main(String[] args) {
        // Write a program to reverse a string
        //      input = ABCD
        //      output = DCBA

		String str= reverse ("ABCD"); 
		System.out.println(str);
	}
	public static String reverse(String r) {  
		char[] letters=new char[r.length()]; 
		int letterIndex=0; 
		for(int i=r.length()-1; i>=0; i--) {
			letters[letterIndex]=r.charAt(i); 
			letterIndex++; 
		}
		String reverse=""; 
		for(int i=0; i<r.length(); i++) {
			reverse=reverse+letters[i]; 
		}
 		return reverse; 
		
		
		
		
	}

}
