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
        
        String kata = input.nextLine();
        
        boolean I = false;
        boolean S = false;
        
        for (int i = 0; i < kata.length(); i++) {
            char huruf = kata.charAt(i);
            
            if(huruf=='I'){
                I = true; 
            }else if(huruf=='S' && I){
                S = true;
            }else if(huruf=='C' && I && S){
                System.out.println("CANTIK");
                return;
            }
            
        }
        System.out.println("TIDAK CANTIK");
     }
}
