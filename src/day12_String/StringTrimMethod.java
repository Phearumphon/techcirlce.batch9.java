package day12_String;

public class StringTrimMethod {
public static void main(String[] args) {
	
	String str  = "Hello  java            "; 
	System.out.println(str.length());
	str=str.trim(); 
	System.out.println(str.length());
	System.out.println(str);
	
	
	String str2="                  TechCircle          "; 
	System.out.println(str2);
	System.out.println(str2.length());
	System.out.println(str2.trim());
	System.out.println(str2);
	
	str2 =str2.trim(); 
	System.out.println(str2);
	
	String str3 = "           Hello Techcirle            ";
	System.out.println(str3.length());
	
	str3= str3.trim(); 
	System.out.println(str3.length());
	System.out.println(str3);
	
	
	
	
	
	
	
}
}
