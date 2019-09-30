package TugasHero;

import java.util.*;

public class MainHero {
	
	void mulai() {
		
		String[] Hero = new String[5];
		int inputAngka;
		do {
			System.out.println("Koleksi Hero");
			System.out.println("Follow saya @risanjayy");
			System.out.println("---------------------------");
			System.out.println("1. Tambah Hero");
			System.out.println("2. Ubah Hero");
			System.out.println("3. Lihat Semua Hero ");
			System.out.println("4. Hapus Hero");
			System.out.println("5. Keluar");
			
			System.out.print("Masukkan Menu yang anda inginkan :");
			Scanner input = new Scanner(System.in);
			inputAngka = input.nextInt();
			
			MainHero addHero = new MainHero();
			
			switch (inputAngka) {
			case 1:
				addHero.inputHero(Hero);
				break;
			case 2:
				addHero.ubahHero(Hero);
				break;
			case 3:
				addHero.tampilHero(Hero);
				
				break;
			case 4:
				addHero.hapusHero(Hero);
				break;
			case 5:
				break;
			default:
				System.out.println("Angka yang anda masukkan Salah");
				break;
			}
		}while(inputAngka !=5);
	}
	
	void inputHero(String[] arrayHero) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < arrayHero.length; i++) {
			System.out.print("Masukkan Hero ke "+ (i+1) + ":");
			arrayHero[i] = input.nextLine();
		}
	}
	
	void tampilHero(String[] arrayHero) {
		if (arrayHero[0] == null) {
			System.out.println("Hero Masih Kosong");
		}else {
			for (int i = 0; i < arrayHero.length; i++) {
				if (arrayHero[i] == null) {
					System.out.println("Hero ke "+(i+1)+" : "+"Masih Kosong");
				}else {
					System.out.println("Hero ke "+(i+1)+" : "+arrayHero[i]);
				}
			}
		}
	}
	
	void ubahHero(String[] arrayHero) {
		Scanner inputIndex = new Scanner(System.in);
		for (int i = 0; i < arrayHero.length; i++) {
			System.out.println("Hero ke "+(i+1)+" : "+arrayHero[i]);
		}
		System.out.print("Masukkan hero keberapa yang ingin anda ubah :");
		int indexHero = inputIndex.nextInt();
		if (indexHero > 0 && indexHero < 5) {
			Scanner inputNama = new Scanner(System.in);
			System.out.print("Masukkan nama hero yang anda inginkan : ");
			String namaBaru = inputNama.nextLine();
			arrayHero[indexHero-1] = namaBaru;
		}else {
			System.out.println("Tidak ada hero ke "+ indexHero + ". Silahkan coba lagi");
		}
	}
	
	void hapusHero(String[] arrayHero) {
		Scanner inputIndex = new Scanner(System.in);
		for (int i = 0; i < arrayHero.length; i++) {
			System.out.println("Hero ke "+(i+1)+" : "+arrayHero[i]);
		}
		System.out.println("Masukkan Hero keberapa yang anda ingin hapus : ");
		int indexHero = inputIndex.nextInt();
		if (indexHero >0 && indexHero < 5) {
			arrayHero[indexHero] = null;
		}else {
			System.out.println("Tidak ada hero ke "+ indexHero + ". Silahkan coba lagi");
		}
	}
	
	public static void main(String[] args) {
		
		MainHero awal = new MainHero();
		awal.mulai();
		
	}
	
	}
