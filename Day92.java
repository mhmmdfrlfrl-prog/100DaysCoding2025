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
public class Day92 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan nama: ");
        String nm = input.nextLine();
        System.out.println("Masukkan umur:");
        int um = input.nextInt();
        
        System.out.println("Nama:" + nama(nm));
        System.out.println("Umur:" + umur(um));
    }
    public static String nama(String nm){
        return nm;
    }
    public static int umur(int um){
        return um;
    
    }
}
