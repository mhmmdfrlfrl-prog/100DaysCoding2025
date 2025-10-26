import java.util.Scanner;
public class Day49{
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Apakah anda mahasiswa (true/false)");
        boolean status = input.nextBoolean();
        
        String hasil = (status==true)? "Mahasiswa":"Bukan Mahasiswa";
        System.out.println("Status : " + hasil);
        
        
             
        
    }
}
