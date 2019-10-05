package com.belajar;

import java.util.HashMap;
import java.util.Map;

public class CobaMap {
	public static void main(String[] args) {
		Map<String, Integer> mapNilai = new HashMap<String, Integer>();
		mapNilai.put("owo", 30);
		System.out.println(mapNilai.get("owo"));
		mapNilai.put("owi", 90);
		System.out.println(mapNilai.containsKey("owo"));
		System.out.println(mapNilai.containsValue(90));
		
		Map<Nasabah, Integer> mapScore = new HashMap<Nasabah, Integer>();
		mapScore.put(new Nasabah("owo"), 90);
		mapScore.put(new Nasabah("owo"), 17);
		System.out.println(mapScore.get(new Nasabah("owo")));
		System.out.println(mapScore.size());
		
	}
}
