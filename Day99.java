package farel;

import java.util.Scanner;


public class Day99 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan N : ");
        int N = input.nextInt();
        
        for (int i = 2; i <= N; i++) {
            boolean prima = true;
            for (int p  = 2; p < i; p++) {
                if(i % p == 0){
                    prima = false;
                    break;
                }
            }
            if (prima) {
                System.out.print(i+" ");
            }
        }
        
    }
}
