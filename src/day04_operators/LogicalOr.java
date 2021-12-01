package day04_operators;

public class LogicalOr {
public static void main(String[] args)  {
	
	//    || OR
	
	//   ConditionA 					ConditionB  			Result
	
//			true									true 							true
//			true									false							true
//			false 								true							true
//			false									false							false		
	
	 
					int A = 1;
					int B  =2; 
					int C  = 3; 
					
					System.out.println(A<B  || C>B );   //true 
					System.out.println(A<B || C<B);     //true
					System.out.println(A*B>C || C>A);     //true
					System.out.println(A>B || A+C<B);     //false
							
	
	
}
}
