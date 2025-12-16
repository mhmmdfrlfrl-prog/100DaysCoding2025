/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farel;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Day100 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        
        int n = input.nextInt();
        
        int [] array = new int [n];
        
        for (int i = 0; i < n; i++) {
            array [i] = input.nextInt();
        }
        
        int p = array [0];
        int panjang = array[p%n];
        
        String hasil = "";
        int i = 0;
        
        while (hasil.length() < panjang){
            hasil += array[i%n];
            i++;
        }
        
        System.out.print(hasil.substring(0, panjang));
        System.out.println();
     }
}
