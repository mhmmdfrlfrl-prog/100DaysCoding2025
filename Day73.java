import java.util.Scanner;
public class Day73 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
            
        
        int jumlah = 0;
        int total;
        while(true){
            System.out.print("Masukkan Angka :");
            int n = input.nextInt();
        
            if(n<0){
               break;
              }
        
            jumlah += n;
        }
       total = jumlah;
        System.out.println("Total :"+ total);
        
    }
    
}
