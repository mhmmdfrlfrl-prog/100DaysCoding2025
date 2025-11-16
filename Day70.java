import java.util.Scanner;
public class Ngoding8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan Baris :");
        int baris = input.nextInt();
        System.out.println("Masukkan Kolom :");
        int kolom = input.nextInt();        
        for(int i = 1; i<= baris; i++){
            for(int j = 1; j<= kolom; j++){
                System.out.print("* ");
            }
        
        System.out.println();
        }
    }
}
