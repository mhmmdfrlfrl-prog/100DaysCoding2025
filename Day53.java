import java.util.Scanner;
public class Day53 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan Angka ");
        int a = input.nextInt();
        
        while (a<=5){
            System.out.print(a+" ");
            a++;
            if(a==4){
                break;
            }
        }
        System.out.println();
        
    }
    
}
