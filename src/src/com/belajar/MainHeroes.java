package com.belajar;

import java.util.Arrays;
import java.util.Scanner;

public class MainHeroes {
	public static void main(String[] args) {
		Heroes gatotKaca = new Heroes("Gatot Kaca", 1000, 100, 20);
		Heroes saitama = new Heroes("Saitama", 1000, 100, 50);
		Tower tower = new Tower(10000);
		
		System.out.println("Koleksi Hero");
		System.out.println("---------------------------");
		System.out.println("1. Tambah Hero");
		System.out.println("2. Ubah Hero");
		System.out.println("3. Lihat Semua Hero ");
		System.out.println("4. Hapus Hero");
		System.out.println("5. Keluar");
		
		System.out.print("Masukkan Menu yang anda inginkan :");
		Scanner input = new Scanner(System.in);
		int inputAngka = input.nextInt();
		
		switch (inputAngka) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;

		default:
			break;
		}
	}
}
