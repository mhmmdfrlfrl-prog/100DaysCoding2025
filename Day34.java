
import java.util.Scanner;
public class Day34 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukka Angka ");
        int a = input.nextInt();
        System.out.println("Masukka Angka ");
        int b = input.nextInt();
        
        System.out.println(!(a==b));
        System.out.println(a<b && a>b);
        System.out.println(a>=b || a<=b);
        
    }
    
}

