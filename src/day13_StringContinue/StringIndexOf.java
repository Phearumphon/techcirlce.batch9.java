package day13_StringContinue;

public class StringIndexOf {
public static void main(String[] args) {
	//                      012345678910  index position
	String name = "President George Washington"; 
	
	System.out.println(name.indexOf('e'));     //2	
			
	System.out.println(name.charAt(2));
	System.out.println(name.length());
	System.out.println(name.indexOf('e', 8));
	System.out.println(name.indexOf("George"));
	System.out.println(name.indexOf("Washington"));
	System.out.println(name.charAt(17));  //w
	System.out.println(name.indexOf("id"));  //4
	System.out.println(name.indexOf("ton"));  //  24
	System.out.println(name.indexOf("irfan"));  //-1
	System.out.println(name.indexOf('z'));   //-1
	
	
	
	
	
	
	
}
}
