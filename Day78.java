import java.util.Scanner;
public class Day78 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan Nama: ");
        String nama = in.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama2 = in.nextLine();
        
        
        System.out.print("Jumlah Huruf : "+nama.length());
        System.out.print("Jumlah Huruf: "+nama2.length());
        System.out.println("Menjadi huruf besar: "+nama.toUpperCase());
        System.out.println("Menjadi huruf kecil: "+nama2.toLowerCase());
        
        
        String kata1 = nama;
        String kata2 = nama2;
        
        System.out.println("Apakah Sama: "+kata1.equals(kata2));
        
        
        
        System.out.println("Hapus Spasi: "+kata1.trim());
        
        
        
        
        
        
        
        
    }
    
}
