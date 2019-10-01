package TugasKelima;

import java.util.Random;
import java.util.Scanner;

public class MainRobotObj {
	RobotObj robot = new RobotObj();
	Random acak = new Random();
	
	public void gerakKeUtara() {
		if (robot.getFuel() == 0) {
			System.out.println("Fuel anda 0, silahkan follow ig @risanjayy untuk mengisi fuel");
		}else {
			if (robot.getY() == 10) {
				System.out.println("Kordinat Y sudah mencapai batas");
			}else {
				int y = robot.getY() + 1;
				int fuel = robot.getFuel() - 1;
				robot.setY(y);
				robot.setFuel(fuel);
			}
		}
	}
	
	public void gerakKeTimur() {
		if (robot.getFuel() == 0) {
			System.out.println("Fuel anda 0, silahkan follow ig @risanjayy untuk mengisi fuel");
		}else {
			if (robot.getX() == 10) {
				System.out.println("Kordinat X sudah mencapai batas");
			}else {
				int x = robot.getX() + 1;
				int fuel = robot.getFuel() -1;
				robot.setX(x);
				robot.setFuel(fuel);
			}
		}
	}
	
	public void gerakKeSelatan() {
		if (robot.getFuel() == 0) {
			System.out.println("Fuel anda 0, silahkan follow ig @risanjayy untuk mengisi fuel");
		}else {
			if (robot.getY() == 0) {
				System.out.println("Kordinat Y sudah mencapai batas");
			}
			else {
				int y = robot.getY() - 1;
				int fuel = robot.getFuel() - 1;
				robot.setY(y);
				robot.setFuel(fuel);;
			}
		}
	}
	
	public void gerakKeBarat() {
		if (robot.getFuel() == 0) {
			System.out.println("Fuel anda 0, silahkan follow ig @risanjayy untuk mengisi fuel");
		}else {
			if (robot.getX() == 0) {
				System.out.println("Kordinat X sudah mencapai batas");
			}else {
				int x = robot.getX() - 1;
				int fuel = robot.getFuel() -1;
				robot.setX(x);
				robot.setFuel(fuel);
			}
		}
	}
	
	public void gerakCombo() {
		Scanner inputGerak = new Scanner(System.in);
		System.out.println("Masukkan Combo : U/T/S/B");
		String indexCombo = inputGerak.next();
		indexCombo.toLowerCase();
		for (int i = 0; i < indexCombo.length(); i++) {
			if (indexCombo.charAt(i) == 'u') {
				gerakKeUtara();
			}else if(indexCombo.charAt(i) == 't') {
				gerakKeTimur();
			}else if(indexCombo.charAt(i) == 's') {
				gerakKeSelatan();
			}else if(indexCombo.charAt(i) == 'b') {
				gerakKeBarat();
			}else {
				continue;
			}
		}
	}
	
	public void start() {
		int inputAngka;
//		int fuel = 5 + acak.nextInt(20);
		int fuel = 2;
		robot.setX(acak.nextInt(10));
		robot.setY(acak.nextInt(10));
		robot.setFuel(fuel);
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Robot XY");
			System.out.println("Follow saya @risanjayy");
			System.out.println("Kordinat X : "+robot.getX());
			System.out.println("Kordinat Y : "+robot.getY());
			System.out.println("FUel : "+robot.getFuel());
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
				gerakKeUtara();
				break;
			case 2:
				gerakKeTimur();
				break;
			case 3:
				gerakKeSelatan();
				break;
			case 4:
				gerakKeBarat();
				break;
			case 5:
				gerakCombo();
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
		MainRobotObj mulai = new MainRobotObj();
		mulai.start();
	}
}
