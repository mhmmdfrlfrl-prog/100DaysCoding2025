import java.util.Scanner;
public class Day48 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        
        int hasil = 0;
        
        System.out.println("Masukkan angka ");
        int angka1 = input.nextInt();
        System.out.println("Masukkan operator (+,-,*,/,%)");
        char pilihan = input.next().charAt(0);
        
        System.out.println("Masukkan angka ");
        int angka2 = input.nextInt();
        
        switch (pilihan){
             case '+':
                hasil = angka1 + angka2;
                break;
             case '-':
                hasil = angka1 - angka2;
                break;
             case '*':
                hasil = angka1 * angka2;
                break;
             case '/':
                hasil = angka1 / angka2;
                break;
             case '%':
                hasil = angka1 % angka2;
                break;
            default:
                System.out.println("operator salah");
                break;
        }
        
           System.out.println("Hasil = " + hasil);
        
        
        
        
        
    }
    
}
