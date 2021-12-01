package day04_operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		//    +=   ,  -=   ,   *=,    /=
		
		int A=10; 
		A +=  5;      //A=A+5   =15
		System.out.println(A);
		A +=10;   // A=A+10       , A=15+10=25
		
		System.out.println(A);     //25
		 
		A  -=5;    //A=A-5   //20
		
		System.out.println(A);
		
		A*= 5;   //A=A*5
		System.out.println(A);   //100
		
		A/= 5;    //A=A/5
		
		System.out.println(A);
	}

}
