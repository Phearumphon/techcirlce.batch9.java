package day15_StringHomework;

public class HomeWorkTask6 {

	public static void main(String[] args) {
//		Write a program to find distinct character from a string
//        String str = "aaaaaaabbbbbbbbbbbccccccccccccddddddeeeeffffgggg";
//        //String expectedStr = "abc";

     	String Str="aaaaaaabbbbbbbbbbbccccccccccccddddddeeeeffffgggg"; 
//		String result=""; 
//		for(int i=1;i<=Str.length()-1; i++) {
//			
//			String abc=Character.toString(Str.charAt(i)); 
//			if(!result.contains(abc)) {
//				result+=abc; 
//			}
//		}
//		System.out.println(result);
	
		String expectedStr ="abc"; 
		String unique= ""; 
	
		
		for (int i = 0 ; i < Str.length() ; i ++) {
			
			char currentChar = Str.charAt(i);
					
			String s = String.valueOf(currentChar);
			
			if (!unique.contains(s)) {
				unique = unique+s;
			}
			
		}
		
		
		System.out.println(unique);
		
		
//		System.out.println(unique.contains("a"));
//		
//		unique = unique+"a";
//		
//		System.out.println(unique.contains("a"));
			
		

		
	}
}
