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
public class Day95 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Nama:");
        String nm = input.nextLine();
        System.out.print("Masukkan Umur:");
        int um = input.nextInt();
        
       nama(nm);
       umur(um);
    }
    
    public static void nama(String nm){
        System.out.println("Nama :"+ nm);
        
    }
    
    public static void umur(int um){
        System.out.println("Umur :"+ um);
    }
    
   
}
