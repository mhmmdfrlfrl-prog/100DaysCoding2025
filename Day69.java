import java.util.Scanner;
public class NgodingDay69 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan N :");
        int n = input.nextInt();
        
        int jumlah = 0;
        for(int i = 1;i<=n;i++){
            System.out.print(" ");
            int m = input.nextInt();
            if(m>0){
                jumlah += i;
            }
        }System.out.println(jumlah);
        
    }
    
}
