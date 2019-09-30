package bebas;

import java.util.Arrays;

public class testing {
	public static void main(String[] args) {
		String[] array = {"apa", "aja,", "lahh"};
		String str = "pokok";
		array[0] = str;
		System.out.println(Arrays.deepToString(array));
	}
}
