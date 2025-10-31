import java.util.Scanner;
public class Day54 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan Angka ");
        int angka = input.nextInt();
        
        for (int i = 1;i<=angka;i++){
            if (i==3){
                continue;
            }
        System.out.println("Angka ke-"+i);
        }
    }
    
}
