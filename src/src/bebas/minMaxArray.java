package bebas;

import java.util.Arrays;
import java.util.Collections;

public class minMaxArray {
	public static void main(String[] args) {
        Integer[] minMax = {2, 1, 5, 4, 3, 6};
//        int min = Arrays.stream(minMax).min().getAsInt();
//        int max = Arrays.stream(minMax).max().getAsInt();
//        System.out.println("Min = " + min);
//        System.out.println("Max = " + max);
        int min = Collections.min(Arrays.asList(minMax));
        int max = Collections.max(Arrays.asList(minMax));
        
        System.out.println("Nilai yang paling kecil adalah " + min);
        System.out.println("Nilai yang paling besar adalah " + max);
        
	}
}
