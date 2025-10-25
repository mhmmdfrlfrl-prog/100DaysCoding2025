import java.util.Scanner;
public class Day49{
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan nama");
        String nama = input.nextLine();
        System.out.println("_____________________");
        System.out.println(" 1 untuk laki- laki");
        System.out.println(" 2 untuk perempuan");
        System.out.println("Masukkan angka");
        int jenis = input.nextInt();
        
        String hasil = (jenis==1)? "Laki-laki":"Perempuan";
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + hasil);
        
        
        
        
        
        
        
        
        
        
    }
}
