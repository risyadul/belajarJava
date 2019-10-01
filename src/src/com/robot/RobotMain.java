package com.robot;

import java.util.*;

public class RobotMain {
	private int x, y, fuel;
	Random randomAngka = new Random();
	
	void gerakKeutara() {
		
		if (this.fuel == 0) {
			System.out.println("Fuel anda 0, silahkan follow ig @risanjayy untuk mengisinya");
		}else {
			if (this.y == 10) {
				System.out.println("Kordinat Y sudah mencapai batas");
			}else {
				this.y += 1;
				this.fuel -= 1;
			}
		}
	}
	
	void gerakKetimur() {
		
		if (this.fuel == 0) {
			System.out.println("Fuel anda 0, silahkan follow ig @risanjayy untuk mengisinya");
		}else {
			if (this.x == 10) {
				System.out.println("Kordinat X sudah mecapai batas");
			}else {
				this.x += 1;
				this.fuel -= 1;
			}
		}
	}
	
	void gerakKeselatan() {
		
		if (this.fuel == 0) {
			System.out.println("Fuel anda 0, silahkan follow ig @risanjayy untuk mengisinya");
		}else {
			if (this.y == 0) {
				System.out.println("Kordinat Y tidak bisa lebih rendah dari 0");
			}else {
				this.y -= 1;
				this.fuel -= 1;
			}
		}
	}
	
	void gerakKebarat() {
		
		if (this.fuel == 0) {
			System.out.println("Fuel anda 0, silahkan follow ig @risanjayy untuk mengisinya");
		}else {
		if (this.x == 0) {
			System.out.println("Kordinat X tidak bisa lebih rendah dari 0");
		}else {
			this.x -= 1;
			this.fuel -= 1;
		}
		}
	}
	
	void gerakanCombo() {
		Scanner inputGerak = new Scanner(System.in);
		System.out.println("Masukkan Combo : U/T/S/B");
		String indexCombo = inputGerak.next();
		indexCombo.toLowerCase();
		for (int i = 0; i < indexCombo.length(); i++) {
			if (indexCombo.charAt(i) == 'u') {
					gerakKeutara();
			}else if(indexCombo.charAt(i) == 't') {
				gerakKetimur();
			}else if(indexCombo.charAt(i) == 's') {
				gerakKeselatan();
			}else if(indexCombo.charAt(i) == 'b') {
				gerakKebarat();
			}else {
				continue;
			}
		}
	}
	
	
	public void start() {
		int inputAngka;
		this.x = randomAngka.nextInt(10);
		this.y = randomAngka.nextInt(10);
		this.fuel = 5 + randomAngka.nextInt(20);
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Robot XY");
			System.out.println("Follow saya @risanjayy");
			System.out.println("Kordinat X : "+x);
			System.out.println("Kordinat Y : "+y);
			System.out.println("FUel : "+fuel);
			System.out.println("---------------------------");
			System.out.println("1. Utara");
			System.out.println("2. Timur");
			System.out.println("3.  Selatan");
			System.out.println("4. Barat");
			System.out.println("5. Combo");
			System.out.println("6. Keluar");
			
			System.out.print("Masukkan Menu yang anda inginkan :");
			inputAngka = input.nextInt();
			
			switch (inputAngka) {
			case 1:
				gerakKeutara();
				break;
			case 2:
				gerakKetimur();
				break;
			case 3:
				gerakKeselatan();
				break;
			case 4:
				gerakKebarat();
				break;
			case 5:
				gerakanCombo();
				break;
			case 6:
				break;
			default:
				System.out.println("Angka yang anda masukkan Salah");
				break;
			}
		}while(inputAngka !=6);
	}
	
	public static void main(String[] args) {
		RobotMain mulai = new RobotMain();
		mulai.start();
	}
}
