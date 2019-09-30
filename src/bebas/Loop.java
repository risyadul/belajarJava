package bebas;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int angka = input.nextInt();
		
		Loop cetak = new Loop();
		cetak.cetakAngka(angka);
		


		
	}
	
	void cetakAngka(int angka) {
		for (int i = 1; i <= angka; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == i) {
					System.out.println(j);
					if (j == angka) {
						for (int x = angka; x >= 1; x--) {
							for (int y = 1; y < x; y++) {
								System.out.print(y);
							}
							System.out.println();
						}
					}
				}else {
					System.out.print(j);
				}
			}
		}
	}

}
