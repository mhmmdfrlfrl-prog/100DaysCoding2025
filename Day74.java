import java.util.Scanner;
public class Day68{
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
            int n;
        int hasil;
        
       do{
            System.out.print("\n=====MENU=====");
            System.out.print("\n1. PENJUMLAHAN");
            System.out.print("\n2. PENGURANGAN");
            System.out.print("\n3. PERKALIAN");
            System.out.print("\n4. PEMBAGIAN");
            System.out.print("\n5. SISA BAGI");
            System.out.print("\n6. TIDAK JADI");
            System.out.println("\nPILIH 1-6");
            n = input.nextInt();
        
          
          
          if(n>=1 && n<=5){
               System.out.print("Masukkan Angka a:");
               int a = input.nextInt();
               System.out.print("Masukkan Angka b:");
               int b = input.nextInt();
        
          switch(n){
             case 1:
                   hasil = a+b;
                   System.out.print("Hasil :"+ hasil);
                   break;
             case 2:
                   hasil = a-b;
                   System.out.print("Hasil :"+ hasil);
                   break;
             case 3:
                   hasil = a*b;
                   System.out.print("Hasil :"+ hasil);
                   break;
             case 4:
                   hasil = a/b;
                   System.out.print("Hasil :"+ hasil);
                   break;
             case 5:
                   hasil = a%b;
                   System.out.print("Hasil :"+ hasil);
                   break;
          }
          }else{
             System.out.print("Pilihan Tidak Jadi");
          }
        }while(n!=6);
       
        
    }
    
}
