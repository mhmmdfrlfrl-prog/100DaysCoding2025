import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Masukkan nama lengkap ");
		String nama = input.nextLine();
		System.out.print("Masukkan nim anda ");
		final String nim = input.nextLine();
		System.out.println("Masukkan umur ");
		int umur = input.nextInt();
		System.out.println("Masukkan Tinggi badan ");
		double tinggi = input.nextDouble();
		System.out.println("Jenis Kelamin ");        
    char jeniskelamin = input.next().charAt(0);
		
		System.out.println("Biodata Anda");
		System.out.println("Nama \t\t:" + nama);
		System.out.println("Nim \t\t:" + nim);
		System.out.println("Umur \t\t:" + umur);        
    System.out.println("Tinggi Badan \t:" + tinggi + "kg");
		System.out.println("Jenis Kelamin \t:" + jeniskelamin); 		
		
	}
}
