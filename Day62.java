import java.util.Scanner;


public class Ngoding2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("Masukkan Angka");
        int n = in.nextInt();
        
        int jumlah = 0;             
        
        for(int i = 1;i<=n;i++){
               jumlah += i;          // 1 + 3 + 6 + 10 + 15 
               
        
        }  System.out.print("Hasil jumlah dari 1 sampai "+"n"+" = "+jumlah);
        
      }
     
    }
