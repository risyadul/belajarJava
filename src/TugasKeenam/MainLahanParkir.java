package TugasKeenam;

import java.util.*;

public class MainLahanParkir {

	LahanParkir objLahan = new LahanParkir();
	
	public void kurangiSlotParkir() {
		if (objLahan.getSlotParkir() == 0) {
			System.out.println("TIdak ada motor yang parkir, Silahkan Follow Ig @risanjayy");
		}else {
			objLahan.setSlotParkir(objLahan.getSlotParkir() - 1);
		}
	}
	
	public void tambahSlotParkir() {
		if (objLahan.getSlotParkir() == objLahan.getNomorPolice().length) {
			System.out.println("Slot Parkir Sudah Penuh, Silahkan Follow Ig @risanjayy");
		}else {
			objLahan.setSlotParkir(objLahan.getSlotParkir() + 1);
		}
	}
	
	public void tambahKendaraan() {
		Scanner input = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < objLahan.getNomorPolice().length; i++) {
			if (objLahan.getNomorPolice()[i] != null) {
				continue;
			}
			System.out.print("Masukkan Nomor Police Kendaraan "+(i+1)+" : ");
			objLahan.setNomorPolice(input.nextLine(), i);
			kurangiSlotParkir();
			System.out.println("Apakah Ingin Lanjut Menambahkan ? Input Y/y jika iya");
			String yY = in.nextLine();
			yY.toLowerCase();
			if (yY != "y") {
				break;
			}
		}
	}
	
	public void kendaraanKeluar() {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < objLahan.getNomorPolice().length; i++) {
			if (objLahan.getNomorPolice()[i] == null) {
				System.out.println("Nomor Police Ke "+(i+1)+" : Masih Kosong");
			}else {
				System.out.println("Nomor Police Ke "+(i+1)+" : "+objLahan.getNomorPolice()[i]);
			}
		}
		System.out.print("Masukkan nomor keberapa nomor police yang ingin keluar : ");
		int index = input.nextInt();
		objLahan.setNomorPolice(null, index-1);
		tambahSlotParkir();
	}
	
	public void printNomorKendaraan() {
		for (int i = 0; i < objLahan.getNomorPolice().length; i++) {
			if (objLahan.getNomorPolice()[i] == null) {
				System.out.println("Nomor Police Ke "+(i+1)+" : Masih Kosong");
			}else {
				System.out.println("Nomor Police Ke "+(i+1)+" : "+objLahan.getNomorPolice()[i]);
			}
		}
	}
	
	public void start() {
		objLahan.setSlotParkir(objLahan.getNomorPolice().length);
		
		int inputAngka;
		do {
			System.out.println("Simulasi Lahan Parkir");
			System.out.println("Follow saya @risanjayy");
			System.out.println("---------------------------");
			System.out.println("Slot Lahan "+objLahan.getSlotParkir());
			System.out.println("1. Tambah Motor");
			System.out.println("2. Keluar Motor");
			System.out.println("3. Lihat Semua Nomor Police");
			System.out.println("4. Keluar");
			
			System.out.print("Masukkan Menu yang anda inginkan :");
			Scanner input = new Scanner(System.in);
			inputAngka = input.nextInt();
			
			switch (inputAngka) {
			case 1:
				tambahKendaraan();
				break;
			case 2:
				kendaraanKeluar();
				break;
			case 3:
				printNomorKendaraan();
				break;
			case 4:
				break;
			default:
				System.out.println("Angka yang anda masukkan Salah");
				break;
			}
		}while(inputAngka !=4);
	}
	
	public static void main(String[] args) {
		MainLahanParkir mulai = new MainLahanParkir();
		mulai.start();
	}
}
