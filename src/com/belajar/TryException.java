package com.belajar;

public class TryException {
	public static void main(String[] args) {
		testTryCatch();
		System.out.println("Selesai");
	}
	
	private static void testTryCatch() {
		int[] arrInt = {1, 2, 3};
		
		try{
			System.out.println(arrInt[4]);
		}catch (RuntimeException e){
			System.out.println("error :"+e.getMessage());
		}
		System.out.println(arrInt[2]);
	}
}
