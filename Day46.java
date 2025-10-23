import java.util.Scanner;
public class Day46 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int harga = 0;
        System.out.println("Menu Makanan");
        System.out.println("1. Mie Ayam\n2.Bakso");
        System.out.print("Pilih: ");
        int pilihan = input.nextInt();
        System.out.print("Porsi: ");
        int porsi = input.nextInt();
        
        switch (pilihan){
            case 1:
                System.out.println("1.Mie Ayam (10k/porsi)");
                harga = 12000 * porsi;
                break;
            case 2:
                System.out.println("2.Bakso (5k/porsi)");
                harga = 10000 * porsi;
                break;
            default:
                System.out.println("pilihan salah");
                break;
        }
        
        System.out.println("Total : " + harga);
        
        
        
        
        
        
    }
    
}
