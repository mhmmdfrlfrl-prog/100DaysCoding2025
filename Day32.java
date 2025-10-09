
import java.util.Scanner;
public class Day32 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("masukkan angka A ");
        int A = input.nextInt();
        System.out.println("masukkan angka B ");
        int B = input.nextInt();
        
        System.out.println(A<=B || A>=B);
        
    }
}
