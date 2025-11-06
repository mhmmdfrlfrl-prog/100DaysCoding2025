import  java.util.Scanner;    
 public class Ngoding {
    public static void main (String[]args){
      Scanner in = new Scanner (System.in);

      System.out.println("Masukkan N:");
      int N = in.nextInt();

      System.out.println("Angka ganjil");
      for(int i = N;i>=1;i--){
        if(i%2==1){
            System.out.print(i+" ");
        }
          }System.out.println();
          
           System.out.println("Angka genap");
          for(int i = N;i>=1;i--){
            if(i%2==0){
               System.out.print(i+" ");
            }
            
      }System.out.println();
    }
}
