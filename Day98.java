package farel;

import java.util.Scanner;

public class Day98 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan N ");
        int N = input.nextInt();
        
        int a = 0;
        int b = 1;
        
        for (int i = 1; i <= N; i++) {
              System.out.print( a + " ");
                int c = a + b;
                a = b;
                b = c; 
               
            
        }
        
    }
}
