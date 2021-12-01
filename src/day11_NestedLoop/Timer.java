package day11_NestedLoop;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) throws InterruptedException {

//        for (int j = 59 ; j >= 0 ; j--) {
//            System.out.println(j);
//        }
//        
//        
//        for (int i = 2-1 ; i >= 0; i--) {
//            System.out.println("Hello");
//        }
        
        Scanner scan = new Scanner(System.in);

        System.out.println("How long do you want to take break?");
        
        
        
        for (int i = scan.nextInt() - 1; i >= 0; i--) {
//            System.out.println(i + " minute");

            for (int j = 59; j >= 0; j--) {
                System.out.println(i + " minute "+j + " Second");
                Thread.sleep(1000);
            }
        }
        
        scan.close();
        

    

for (int j = 1 ; j < 6 ; j++) {
    for (int i = 1 ; i < 11; i++) {
        
        System.out.print(i+" ");
        
        if (i == 5) {
            break;
        }
        
    }
    
    System.out.println();
}





}

}
