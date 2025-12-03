package Day87;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [] array = {3,5,6,7,8};
        
        System.out.println("Data :");
        
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]+ " ");
            
        }
        
        System.out.print("Cari Data : ");
        int cari = input.nextInt();
        
        int i;
        System.out.println("Hasil Cari : ");
        for(i =0;i<array.length;i++){
            if(array[i]==cari){
                System.out.println("Data Ada");
                break;
            
            }
            }
        if(i == array.length){
            System.out.println("Data Tak de");
        }
        
    }
}
