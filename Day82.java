import java.util.Scanner;
public class Day82 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int [] angka = new int [5];
        
        for (int i = 0;i<5;i++){
            System.out.print("Elemen ke-"+i+" : ");
            angka[i]= in.nextInt();
        }
        
        System.out.println("==Cetak Isi Elemen==");
        for (int i = 0;i<5;i++){
            System.out.println("Eleme ke-"+i+" = "+angka[i]);
        }
    }
    
}
