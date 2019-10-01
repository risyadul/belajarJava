package bebas;

import java.util.Scanner;

public class MenghitungHari {
	public static void main(String[] args) {
		int bulan, tahun;
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan Bulan ke Berapa :");
		bulan = input.nextInt();
		System.out.println("Masukkan Tahun :");
		tahun = input.nextInt();
		
		switch (bulan) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Jumlah hari dari Bulan ke " + bulan + " dan tahun " + tahun + " adalah 31 hari");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Jumlah hari dari Bulan ke " + bulan + " dan tahun " + tahun + " adalah 30 hari");
			break;
		case 2:
			if ((tahun % 400 == 0) || (tahun % 400 != 0 && tahun % 100 != 0 && tahun % 4 == 0)) {
				System.out.println("Jumlah hari dari Bulan ke " + bulan + " dan tahun " + tahun + " adalah 29 hari");
			}else {
				System.out.println("Jumlah hari dari Bulan ke " + bulan + " dan tahun " + tahun + " adalah 28 hari");
			}
			break;
		default:
			System.out.println("Angka yang anda masukkan tidak termasuk bulann");
			break;
		}
	}
}
