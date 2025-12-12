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
public class Day96 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan a:");
        int a = input.nextInt();
        System.out.println("Masukkan b:");
        int b = input.nextInt();
        
        System.out.println("Hasil "+ a + "+" + b + " = " + tambah(a,b));
        System.out.println("Hasil "+ a + "-" + b + " = " + kurang(a,b));
        System.out.println("Hasil "+ a + "*" + b + " = " + kali(a,b));
        System.out.println("Hasil "+ a + "/" + b + " = " + bagi(a,b));
        
    }
     public static int tambah(int a,int b){
         return a + b;
     }
     public static int kurang(int a,int b){
         return a - b;
     }
     public static int kali(int a,int b){
         return a * b;
     }
     public static int bagi(int a,int b){
         return a / b;
     }
     
}
