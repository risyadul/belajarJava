package bebas;

import java.util.Scanner;

public class CobaScanner {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	//String
//	System.out.println("Masukkan String : ");
//	String str = input.nextLine();
//	System.out.println("String yang anda masukkan adalah " + str);
	
	//Integer
	System.out.println("Masukkan angka 1-12 : ");
	int angka = input.nextInt();
	switch (angka) {
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
		System.out.println("Angka yang anda masukkan adalah " + angka);
		break;

	default:
		System.out.println("angka yang anda masukkan tidak sesuai sayy");
		break;
	}
	
//	System.out.println("Masukkan angka 1-12");
//	int angka = input.nextInt();
//	if (angka > 0 && angka < 13) {
//		System.out.println("oke siippp follow igku : @risanjayy");
//	}else {
//		System.out.println("salah angkanya slurr follow igku : @risanjayy");
//	}
}
}
