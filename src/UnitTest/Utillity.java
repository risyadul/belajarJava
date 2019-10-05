package UnitTest;

import java.util.*;

public class Utillity {
	public String buangChar(String data) {
		String roy, umo, K = null;
		int index = data.indexOf("_");
		roy = data.substring(0, index);	
		umo = data.substring(index+2, data.length());
		K = data.substring(index+1, index+2).toUpperCase();

		return roy + K + umo;
	}
}
