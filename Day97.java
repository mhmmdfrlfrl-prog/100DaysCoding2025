package farel;

import java.util.Scanner;


public class Day97 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan Sisi");
        int s = input.nextInt();
        
        System.out.println("Luas Persegi:"+ luas(s));
    }
    public static int luas(int s){
        return s * s;
    }
}
