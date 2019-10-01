package com.belajar;

public class TestMain {
	public static void main(String[] args) {
		Rectangle persegiPanjang = new Rectangle(8d, 3d);
		System.out.println(persegiPanjang.getSurface());
		System.out.println(persegiPanjang.print());
		
		Block balok = new Block(8d, 3d, 5d);
		System.out.println(balok.getSurface());
		
		Rectangle balokkw = new Block(8d, 3d, 5d);
		System.out.println(balokkw.getSurface());
	}
}
