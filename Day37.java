import java.util.Scanner;
public class Day37 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Angka ");
        int angka = input.nextInt();
        
        if(angka%2==0){
            System.out.println(angka+" adalah bilagan genap");
        } else {
            System.out.println(angka+" adalah bilangan ganjil");
        }
    }
    
}
