import java.util.Scanner;

public class latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah array: ");
        int n = input.nextInt();

        int[] a = new int[n];

        // Input nilai array
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }

        // Mencari nilai maksimum
        int max = a[0];
        for(int i = 0; i < n; i++){
            if(a[i] > max){ //    
                max = a[i];
            }
        }

        System.out.println("Maksimal = " + max);
    }
}
