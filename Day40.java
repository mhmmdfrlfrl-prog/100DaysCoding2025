import java.util.Scanner;
public class Day40 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int hasil1,hasil2,hasil3,hasil4;
        System.out.println("Masukkan angka a ");
        int angka1= input.nextInt();
        System.out.println("Masukkan (+,-,*,/)");
        char pilih = input.next().charAt(0);
        System.out.println("Masukkan angka b ");
        int angka2 = input.nextInt();
        
        
        if(pilih=='+'){
            hasil1 = angka1 + angka2;
            System.out.println("hasil "+ hasil1);
        }else if (pilih=='-'){
            hasil2 = angka1 - angka2;
            System.out.println("hasil "+ hasil2);
        }else if (pilih=='*'){
            hasil3 = angka1 * angka2;
            System.out.println("hasil "+ hasil3);
        }else if (angka2 !=0){
            hasil4 = angka1 / angka2;
            System.out.println("hasil "+ hasil4);
        
        }else{
            System.out.println("tidak valid masukkan lagi");
        }
        
        
        
        
        
        
        
    }
    
}
