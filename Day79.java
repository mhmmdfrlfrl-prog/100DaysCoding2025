import java.util.Scanner;
public class Day79 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Buat Username: ");
        String user = in.nextLine();
        System.out.print("Buat Password: ");
        String sandi = in.nextLine();
        
          System.out.print("=======LOGIN=======\n");
        do{
            System.out.print("Masukkan Username: ");
            String username = in.nextLine();
            System.out.print("Masukkan Password: ");
            String password = in.nextLine();
            
            if(username.equals(user) && password.equals(sandi)){
                System.out.println("Login Berhasil");
                break;
            }else{
                System.out.println("Coba lagi");
            }
            
        }while(true);
        
        
    }
    
}
