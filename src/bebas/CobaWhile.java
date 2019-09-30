package bebas;

import java.util.Scanner;

public class CobaWhile {
	public static void main(String[] args) {
//		int total,nilaiAwal,nilaiAkhir;
//		Scanner input = new Scanner(System.in);
//		System.out.println("Masukkan Nilai Awal :");
//		nilaiAwal = input.nextInt();
//		System.out.println("Masukkan Nilai Akhir :");
//		nilaiAkhir = input.nextInt();
		
		int a = 0;
		
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
				if(i == j) {
					break;
				} else if ((i+j) == 8) {
					break;
				}
			}
			System.out.print("\n");
		}
	}
}
