package day12_String;

public class SrtingEqualMethod {

	public static void main(String[] args) {
		String str1 ="java"; 
		String str2 ="JAVA"; 
		String str3="Java"; 
		String str4="JAVA"; 
		
		System.out.println(str1.equals(str2));    //false
		System.out.println(str2.equals(str4));    //true
		System.out.println(str3.equals(str4));    // false 
		System.out.println(str1.equalsIgnoreCase(str4));
		
		
		
		
		
		

	}

}
