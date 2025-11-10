package com.mycompany.ngoding100day;

import java.util.Scanner;


public class Ngoding3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Angka:");
        int n = input.nextInt();
        
        int jumlah = 1;  
        
        for(int i = 1;i<=n;i++){
               jumlah *= i;
               
             }
        System.out.println(jumlah);
            
          }
     
    }
