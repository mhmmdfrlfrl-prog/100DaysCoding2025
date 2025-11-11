
package com.mycompany.ngoding100day;

import java.util.Scanner;


public class Ngoding5 {
        public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
            System.out.println("Masukkan Bilangan:");
            int bil = in.nextInt();
            
            int jumlah = 1;
            
            for(int i = bil;i>=1;i--){
                
                jumlah *= i;
            }System.out.println(jumlah);
    }
}            
            
            
  
