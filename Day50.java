import java.util.Scanner;
public class Day50{
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        // untuk hari ke 50
        System.out.println("Masukkan ");
        int angka = input.nextInt();
        
        String hasil = (angka%2==0)? "Genap" : "Ganjil";
        
        System.out.println(angka +" adalah bilangan " + hasil);
    }
    
    
}
