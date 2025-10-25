import java.util.Scanner;
public class Day49{
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan nama");
        String nama = input.nextLine();
        System.out.println("_____________________");
        System.out.println(" L untuk laki- laki");
        System.out.println(" P untuk perempuan");
        System.out.println("Masukkan ");
        char jenis = input.next().charAt(0);
        
        String hasil = (jenis=='L')? "Laki-laki":"Perempuan";
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + hasil);
        
        
        
        
        
        
        
        
        
        
    }
}
