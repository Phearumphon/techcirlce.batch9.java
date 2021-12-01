package day15_StringHomework;

public class HomeWorkTask1 {

	public static void main(String[] args) {
//		 * That, given positive Integer N, Points the consecutive numbers from 1 to N,
//         * each on a separate line, However, and number divisible by 2, 3, 5, should be
//         * replaced by the word Codility, Test, Coders respectively.
//         * 
//         * If the number divisible by more than one if the numbers: 2,3 or 5, it should
//         * be replaced by a concatenation of the respective words Codility, Test, and
//         * Coders in the given order. For example, numbers divisible by both 2 and 3
//         * should be replaced by CodilityTest and numbers divisible by all three
//         * numbers: 2,3, and 5, should be replaced by CodilityTestCoders. For example,
//         * here is the output for 24: 
		
		
	        String Str1= "Condility"; 
	        String Str2= "Test"; 
	        String Str3= "Coders"; 
	        
			for (int N = 1; N <= 24; N++) {
				if (N % 2 == 0 && N % 3 == 0 && N % 5 == 0) {
					System.out.println(Str1 + Str2 + Str3);
				} else if (N % 2 == 0 && N % 3 == 0) {
					System.out.println(Str1 + Str2);
				} else if (N % 2 == 0 && N % 5 == 0) {
					System.out.println(Str1 + Str3);
				} else if (N % 3 == 0 && N % 5 == 0) {
					System.out.println(Str2 + Str3);

				} else if (N % 2 == 0) {
					System.out.println(Str1);
				} else if (N % 3 == 0) {
					System.out.println(Str2);
				} else if (N % 5 == 0) {
					System.out.println(Str3);
				} else {
					System.out.println(N);
				}
			}
		}

	}
