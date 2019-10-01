package LahanParkirObj;

import java.util.Arrays;
import java.util.Scanner;

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
		if (objLahan.getSlotParkir() == 10) {
			System.out.println("Slot Parkir Sudah Penuh, Silahkan Follow Ig @risanjayy");
		}else {
			objLahan.setSlotParkir(objLahan.getSlotParkir() + 1);
		}
	}
	
	public void tambahKendaraan(LahanParkir[] data) {
		Scanner input = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < data.length; i++) {
			if (data[i].getNomorPolice() != null) {
				continue;
			}else {
				System.out.print("Masukkan Nomor Police :");
				data[i].setNomorPolice(input.nextLine());
				kurangiSlotParkir();
				System.out.print("Apakah Ingin Lanjut Menambahkan ? Input 1 jika iya");
				Integer yY = in.nextInt();
				if (yY != 1) {
					break;
				}else {
					continue;
				}
			}
		}
	}
	
	public void keluarKendaraan(LahanParkir[] data) {
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < data.length; i++) {
			if (data[i].getNomorPolice() == null) {
				System.out.println("Nomor Police Ke "+(i+1)+" : Masih Kosong");
			}else {
				System.out.println("Nomor Police Ke "+(i+1)+" : "+data[i].getNomorPolice());
			}
		}
		
		System.out.print("Masukkan nomor keberapa yang ingin anda hapus :");
		
		int index = input.nextInt();
		
		if (index > 0 && index < objLahan.getSlotParkir()) {
			if (data[index-1].getNomorPolice() == null) {
				System.out.println("Motor/Lahan Sudah kosong, Silahkan Follow ig @risanjayy");
			}else {
				data[index-1].setNomorPolice(null);
				tambahSlotParkir();
			}
		}else {
			System.out.println("Angka yang anda masukkan salah");
		}
	}
	
	public void printNomorKendaraan(LahanParkir[] data) {
		for (int i = 0; i < data.length; i++) {
			if (data[i].getNomorPolice() == null) {
				System.out.println("Nomor Police Ke "+(i+1)+" : Masih Kosong");
			}else {
				System.out.println("Nomor Police Ke "+(i+1)+" : "+data[i].getNomorPolice());
			}
		}
	}
	
	public void start() {
		objLahan.setSlotParkir(10);
		LahanParkir[] arrParkirObj = new LahanParkir[objLahan.getSlotParkir()];
		for (int i = 0; i < arrParkirObj.length; i++) {
			arrParkirObj[i] = new LahanParkir();
		}
		System.out.println(Arrays.deepToString(arrParkirObj));
		int inputAngka;
		do {
			System.out.println("Simulasi Lahan Parkir");
			System.out.println("Follow saya @risanjayy");
			System.out.println("---------------------------");
			System.out.println("Slot Lahan Parkir : "+objLahan.getSlotParkir());
			System.out.println("Slot Lahan ");
			System.out.println("1. Tambah Motor");
			System.out.println("2. Keluar Motor");
			System.out.println("3. Lihat Semua Nomor Police");
			System.out.println("4. Keluar");
			
			System.out.print("Masukkan Menu yang anda inginkan :");
			Scanner input = new Scanner(System.in);
			inputAngka = input.nextInt();
			
			switch (inputAngka) {
			case 1:
				tambahKendaraan(arrParkirObj);
				break;
			case 2:
				keluarKendaraan(arrParkirObj);
				break;
			case 3:
				printNomorKendaraan(arrParkirObj);
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
