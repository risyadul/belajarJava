package TugasKeempat;

import java.util.Scanner;

public class MainHeroes {
	Heroes[] hero = new Heroes[5];
	Scanner inputNama = new Scanner(System.in);
	Scanner inputHp = new Scanner(System.in);
	Scanner inputMana = new Scanner(System.in);
	
	
	public void tambahHero() {
//		Scanner inputIndex = new Scanner(System.in);
		for (int i = 0; i < hero.length; i++) {
			
			if (hero[i] != null) {
				continue;
			}else {
				System.out.print("Masukkan nama hero ke "+(i+1)+" : ");
				hero[i].setNama(inputNama.nextLine());
				
				System.out.print("Masukkan Mana hero : ");
				hero[i].setMana(inputMana.nextInt());
				
				System.out.print("Masukkan Hp hero : ");
				hero[i].setHp(inputHp.nextInt());
			}
			
		}
	}
	public void lihatHero() {
		for (int i = 0; i < hero.length; i++) {
			if (hero[i].getNama() == null) {
				System.out.println("Hero Ke "+(i+1)+" : Kosong ");
			}else {
			System.out.println("Hero Ke "+(i+1)+" : "+hero[i].getNama());
			System.out.println("HP : "+hero[i].getHp());
			System.out.println("Mana : "+hero[i].getMana());
			}
		}
	}
	
	public void ubahHero() {
		Scanner pilihHeroes = new Scanner(System.in);
		for (int i = 0; i < hero.length; i++) {
			if (hero[i].getNama() == null) {
				System.out.println("Hero Ke "+(i+1)+" : Kosong ");
			}else {
			System.out.println("Hero Ke "+(i+1)+" : "+hero[i].getNama());
			System.out.println("HP : "+hero[i].getHp());
			System.out.println("Mana : "+hero[i].getMana());
			}
		}
		System.out.print("Pilih Hero yang ingin diubah : ");
		int indexHeroes = pilihHeroes.nextInt();
		if (hero[indexHeroes].getNama() != null) {
			if (indexHeroes > 0 && indexHeroes < 5) {
				System.out.print("Masukkan Nama Hero : ");
				hero[indexHeroes-1].setNama(inputNama.nextLine());
				System.out.println("Masukkan Mana Hero :");
				hero[indexHeroes-1].setMana(inputMana.nextInt());
				System.out.println("Masukkan Hp Hero :");
				hero[indexHeroes-1].setHp(inputHp.nextInt());
			}
		}else {
			System.out.println("Heronya masieh kosong, silahkan follow ig @risanjayy");
		}
		
	}
	
	public void hapusHeroes() {
		Scanner pilihHeroes = new Scanner(System.in);
		for (int i = 0; i < hero.length; i++) {
			System.out.println("Hero Ke "+(i+1)+" : "+hero[i].getNama());
			System.out.println("HP : "+hero[i].getHp());
			System.out.println("Mana : "+hero[i].getMana());
		}
		System.out.print("Pilih Hero yang ingin dihapus : ");
		int indexHeroes = pilihHeroes.nextInt();
		if (indexHeroes > 0 && indexHeroes < 5) {
			hero[indexHeroes-1].setNama(null);
			hero[indexHeroes-1].setHp(0);
			hero[indexHeroes-1].setMana(0);
		}
	}
	
	public void start() {
		for (int i = 0; i < hero.length; i++) {
			hero[i] = new Heroes();
		}
		int inputAngka;
		Scanner input = new Scanner(System.in);
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
			inputAngka = input.nextInt();
			
			switch (inputAngka) {
			case 1:
				tambahHero();
				break;
			case 2:
				ubahHero();
				break;
			case 3:
				lihatHero();
				break;
			case 4:
				hapusHeroes();
				break;
			case 5:
				break;
			default:
				System.out.println("Angka yang anda masukkan Salah");
				break;
			}
		}while(inputAngka !=5);
	}
	
	public static void main(String[] args) {
		MainHeroes mulai = new MainHeroes();
		mulai.start();
	}
}
