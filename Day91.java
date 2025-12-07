/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day91;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Day91 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Nama:");
        String nama = input.nextLine();
        System.out.print("Umur:");
        int umur = input.nextInt();
        
        bio(nama,umur);
    }
    public static void bio(String nama,int umur){
        System.out.println("Nama:" + nama);
        System.out.println("Umur:" + umur + " tahun");
    }
}
