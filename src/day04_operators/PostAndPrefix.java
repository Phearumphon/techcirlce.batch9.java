package day04_operators;

public class PostAndPrefix {
public static void main(String[] args) {
	//postfix
	int numA  = 10; 
	numA++;   //11
	
	System.out.println(numA);         //11
	System.out.println(numA++);   //11 still the same line  value update in next line 
	System.out.println(numA);   //12
	
	System.out.println(numA--);  //12
	System.out.println(numA);     //11     
	
	
	
	//prefix -->before the variable name; 
	
	   
	int a =10; 
	  
	++a;
	System.out.println(a);   //11    
	System.out.println(++a);   //12   value of variable update the same line.
	System.out.println(--a);  //11
	System.out.println(a);   //11
	
	
	
	
	
}
}
