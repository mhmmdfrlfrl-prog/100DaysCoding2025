package com.mycompany.ngoding100day;

import java.util.Scanner;


public class Ngoding4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan M:");
        int m = in.nextInt();
        System.out.print("Masukkan N:");
        int n = in.nextInt();

        int jumlah = 1;
         
        for (int i = 1; i<= n; i++) {
            jumlah = jumlah * m;
        }      
        System.out.println(jumlah);
        
    }
}
