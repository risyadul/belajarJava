package com.belajar;

import java.util.*;

public class TestMain {
	public static void main(String[] args) {
//		Rectangle persegiPanjang = new Rectangle(8d, 3d);
//		System.out.println(persegiPanjang.getSurface());
//		System.out.println(persegiPanjang.print());
//		
//		Block balok = new Block(8d, 3d, 5d);
//		System.out.println(balok.getSurface());
//		
//		Rectangle balokkw = new Block(8d, 3d, 5d);
//		System.out.println(balokkw.getSurface());
		
		Set<CobaFinal> circleSet = new HashSet<>();
		
		circleSet.add(new CobaFinal((double) 10));
		circleSet.add(new CobaFinal((double) 5));
		circleSet.add(new CobaFinal((double) 1));
		circleSet.add(new CobaFinal((double) 1));
		circleSet.add(new CobaFinal((double) 1));
		circleSet.add(new CobaFinal((double) 3));
		circleSet.add(new CobaFinal((double) 4));
		
		for (CobaFinal cobaFinal : circleSet) {
			System.out.println(cobaFinal);
		}
	}
}
