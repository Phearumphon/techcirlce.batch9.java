package day13_StringContinue;

public class String_Substring {
	public static void main(String[] args) {
	
		
		//                     0123456789
		String word = "television";
		String word2= word.substring(2,5);
		System.out.println(word2);
		System.out.println(word.substring(4));
		System.out.println(word.length());
		
		System.out.println(word.substring(4,word.length()));
		System.out.println(word.substring(4,10));
		
		
		
		// String email= "iran.tursun@techcircleSolution.org";
		// write a program to find the domain name of the following emails.
		
		
		String email2= "test@gmail.com";
		String email3= "test@yahoo.com";
		String email4= "test@outlook.com";
		String email5= "test@github.com";
		
		 System.out.println(email2.substring(5,10));// gmail
	        
//       String domain = email2.substring(email2.indexOf('@')+1,email2.indexOf('.'));
       
		 System.out.println(email2.substring(email2.indexOf('@')+1,email2.indexOf('.')));
	        
		
		// Write a program to find first and last name of the given email
	        
	        
	        String email6 = "Shafkat.ali@techcirclesolutions.org";
	      
	        System.out.println("First name: " + email6.substring(0, email6.indexOf('.')));
	            System.out.println("Last name: " + email6.substring(email6.indexOf('.')+1 , email6.indexOf('@')));
		
	}

}
