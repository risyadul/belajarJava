package com.belajar;

import java.util.Date;

public class MainTestParam {
	public static void main(String[] args) {
		TestParam idroes = new TestParam("Adroes", "Ragunan",  10, "Timor Leste", new Date(2009, 3, 13));
		
		System.out.println(idroes.printAttributes());
	}
}
