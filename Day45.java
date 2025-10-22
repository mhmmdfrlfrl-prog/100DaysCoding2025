import java.util.Scanner;
public class Day45 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan Jenis Kelamin (L/P)");
        String pilihan = input.nextLine();
        
        switch (pilihan){
            case "L":
                System.out.println("Laki-laki");
                break;
            case "P":
                System.out.println("Perempuan");
                break;
            default:
                System.out.println("pilihan salah");
                break;
        }
        
        
        
    }
    
}
