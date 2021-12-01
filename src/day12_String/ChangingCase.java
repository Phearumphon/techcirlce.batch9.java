package day12_String;

public class ChangingCase {

	public static void main(String[] args) {
		
		String word = "jaVa"; 
		System.out.println(word.toLowerCase());
		
		word= word.toLowerCase(); 
		System.out.println(word);
		
		word =word.toUpperCase(); 
		System.out.println(word);
		
		String str1="techcirle"; 
		String str2 ="TechCircle"; 
		
		boolean result =str1.equals(str2);       //false
		boolean result = str2.toLowerCase(); 
	
		
		
   		

	}

}
