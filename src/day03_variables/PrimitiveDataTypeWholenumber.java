package day03_variables;

public class PrimitiveDataTypeWholenumber {

	public static void main(String[] args) {
	
		// byte, short, int, long 
		
		byte day =7; 
		byte month = 8;
		short page = 254; 
		int distance = 268; 
		long phoneNumber = 703_459_1234L; 
	System.out.println(phoneNumber);
	
	
	System.out.println(Byte.MIN_VALUE);
	System.out.println(Byte.MAX_VALUE);
	
	//    -128 TO 127
	
		int page2 = 254;
		byte page3 = (byte)254;
		System.out.println(page3);
		
	
		int phone3 =  (int) 7031231234L; 
		
		System.out.println(phone3);
		
		
		// you can ad your comment here 
		
		/**/
		
		byte valueA = 50; 
		short valueB = valueA; 
	     long valueC = valueA; 
		System.out.println(valueB);
		System.out.println(valueA);
		
		
		long valueL = 30; 
		// int valueI = valueL;    error
		
		int valueI = (int) valueL; 
		System.out.println(valueI); 
		
		float taxRate =0.3f;
		
		double price =9.99;
		double balance =100.35;
		int priceInt =  (int)price;
		 System.out.println(price);   //9.99
		System.out.println(priceInt);  //9
		System.out.println("Value of variable price is "+price);
		System.out.println("Value of variable priceInt is " + priceInt);
		
		
		
	   
	   
	   
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
		
	
		
		
		

	}

}
