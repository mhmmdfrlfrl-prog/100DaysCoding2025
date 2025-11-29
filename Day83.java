package javaapplication11;

import java.util.Scanner;


public class Day83 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int [] angka = new int [5];
        int total = 0;
        
        for (int i = 0;i<5;i++){
            System.out.println("Masukkan = ");
            angka[i] = in.nextInt();
            
            total += angka[i];
                    
            
        }
        System.out.println("Hasil = "+ total);
    
    }
}
