package day05_ifStatment;

public class Review {

	public static void main(String[] args) {
	
		int a=10; 
		int b =15; 
		
		System.out.println(a>b && b>a);   //false
		System.out.println(a>b || b>a);        //true
		System.out.println(!(a>b && b>a));   //true
	
		int c  = (a>b)  ? 1:2; 
		
		System.out.println(c);
		System.out.println(c++);
		System.out.println(c);
		
		c+=5;    //c=c+5
		System.out.println(c);  //8
		System.out.println(--c);  //7
		
		final double pi =3.14;
		
		//pi =6.14; 
		System.out.println(pi);
		
		int result =23%6; 
		System.out.println(result);  //5
		 
		String str = (result>3) ? "str1": "str2";
		
		System.out.println(str);    //str1
		
		// Write a program to find a given number is positive or negative 
		
		//   num1 = 10; 
		
		    int  num1=10; 
		    String msg = (num1>0) ? num1+ "is positive" : "is negative"; 
		    
		  System.out.println(msg);
	//	System.out.println( num1>=0? num1    +   " is positive" : num1+"is negative");
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
