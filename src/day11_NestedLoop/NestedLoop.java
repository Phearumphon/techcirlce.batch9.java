package day11_NestedLoop;

public class NestedLoop {

	public static void main(String[] args) {
		// write the program to print 1~5   =10times
		
	 
		for(int i=1;i<=10;i++) {
			for( int j=1; j<=5; j++) {
				System.out.println(j);
				
			}
			
		}
		
		
		//Write a program to print below statements 
		// use nested for loop 
		// 123
		// 123
		// 123
		
		System.out.println("---------------------------------------");
		for (int b=0;b<3;b++) {
			for(int c=1;c<=3; c++) {
				System.out.print(c+" " );
			}
		}
		
		
		
		
		
		
		
		
	}
}
