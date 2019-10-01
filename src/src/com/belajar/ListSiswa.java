package com.belajar;

import java.util.*;

public class ListSiswa {
	public static void main(String[] args) {
		String[][] listSiswa;
		listSiswa = new String[5][3];
		
		listSiswa[0][0] = "Adoel";
		listSiswa[0][1] = "Ragunan";
		listSiswa[0][2] = "Tangerang";
		
		listSiswa[1][0] = "Galieh";
		listSiswa[1][1] = "Ragunan";
		listSiswa[1][2] = "Papua";
		
		listSiswa[2][0] = "Idroes";
		listSiswa[2][1] = "Ragunan";
		listSiswa[2][2] = "BonBin";
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < listSiswa.length; i++) {
			for (int j = 0; j < listSiswa[i].length; j++) {
				System.out.println("Masukkan Input index i =  "+i+", index j ="+j);
				listSiswa[i][j] = input.nextLine();
			}
		}
		System.out.println(Arrays.deepToString(listSiswa));
		
	}
}
