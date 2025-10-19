import java.util.Scanner;
public class Day42 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan Gaji :");
        double gaji = input.nextDouble();
        System.out.println("Masukkan status pegawai (1 Tetap ,2 Honor) :");
        int status = input.nextInt();
        
        double potongan = 0;
        if(status==1){
             potongan = gaji * 0.1;
        }else if (status==2){
             potongan = gaji * 0.05;
        }else{
            System.out.println("Status pegawai tidak valid");
        }
        
        double gajibersih = gaji - potongan;
        
        System.out.printf("Gaji awal : %.2f ",gaji);
        System.out.printf("%nGaji Bersih : %.2f ", gajibersih,);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
