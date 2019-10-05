package com.belajar;

import TugasKedelapan.Person;

public class TestPass {
	public static void main(String[] args) {
		String nama = "owo";
		updateSetNama(nama);
		System.out.println(nama);
		
		Person pers = new Person();
		pers.setName("owi");
		updateSetNama(pers);
		System.out.println(pers.getName());
	}
	
	private static void updateSetNama(String nama) {
		nama += " updated";
	}
	
	private static void updateSetNama(Person pers) {
		pers.setName(pers.getName()+" updated");
	}
}
