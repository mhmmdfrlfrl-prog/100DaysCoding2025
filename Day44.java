import java.util.Scanner;
public class Day44 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan Nilai : ");
        int nilai = input.nextInt();
        String predikat = "";
        
        if(nilai>=95){
            predikat = "A";
            
        }else if (nilai>=85 || nilai<=94){
            predikat = "B";
        
        }else if (nilai>=75 || nilai<=84){
            predikat = "C";
        
        }else if (nilai>=65 || nilai<=74){
            predikat = "D";
        
        }else if (nilai<64){
            predikat = "E";
        }else{
            System.out.println("nilai tidak valid");
        }
        
        System.out.println("Nilai \t: "+ nilai);
        System.out.println("Predikat : " + predikat);
        
        
        
        
        
        
        
        
        
        
    }
    
}
