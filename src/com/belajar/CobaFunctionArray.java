package com.belajar;

import java.util.Arrays;

public class CobaFunctionArray {
	public static void main(String[] args) {
		Integer[] array = {2, 1, 3, 4, 7, 1, 5, 11};
		
		CobaFunctionArray func = new CobaFunctionArray();
		
		System.out.println(Arrays.deepToString(func.kembalianArray(array)));
	}
	
	public Integer[] kembalianArray(Integer[] array) {
		Integer[] arr = new Integer[array.length];
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				arr[j] = array[i];
				j++;
			}
		}
		return arr;
	}
}
