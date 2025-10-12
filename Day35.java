
import java.util.Scanner;
public class Day35 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukka Nilai");
        int nilai = input.nextInt();
        
        if (nilai>=70){
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
        
        
        
    }
}
