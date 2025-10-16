import java.util.Scanner;
public class Day39 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("==PILIHAN MENU==");
        System.out.println("1. Mie Ayam ");
        System.out.println("2. Bakso Urat ");
        System.out.println("3. Nasi Goreng ");
        System.out.println("Pilih Menu 1-3 ");
        int angka = input.nextInt();
        
        
        if(angka==1){
            System.out.println("Mie Ayam 1 porsi : 12000");
        }else if (angka==2){
            System.out.println("Bakso Urat 1 porsi : 10000");
        }else{
            System.out.println("Nasi Goreng 1 porsi : 15000");
        }
        
        
        
        
        
    }
    
}
