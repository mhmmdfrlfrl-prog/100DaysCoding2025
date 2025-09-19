import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Masukkan Nama ");
		String nama = input.nextLine();
		System.out.print("Masukkan Alamat ");
		String alamat = input.nextLine();
		System.out.println("Masukkan Umur");
		int umur = input.nextInt();
		System.out.println("Masukkan Berat anda");
		double berat = input.nextDouble();
		System.out.println("Masukkan Tinggi Badan");
		float tinggi = input.nextFloat();
		System.out.println("Masukkan Kelas");
		char kelas = input.next().charAt(0);
		
		
	        System.out.print("=====Biodata Anda=====\n");
			System.out.print("Nama Anda :" + nama);
		System.out.print("\nAlamat Anda " + alamat);
		System.out.println("\nUmur Anda :" + umur + "Tahun");
		System.out.println("Berat Badan Anda :" + berat + "kg");
		System.out.println("Tinggi Badan Anda :" + tinggi + "cm");
		System.out.println("Kelas :" + kelas);
		
	}
}
