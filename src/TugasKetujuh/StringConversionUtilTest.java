package TugasKetujuh;

public class StringConversionUtilTest {
	
	public String underscoredToCamelCase(String data) {
		String tampung = "";
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i)!='_') {
				if (i ==data.indexOf('_', i-1)+1) {
					tampung += Character.toUpperCase(data.charAt(i));
				}else {
					tampung += data.charAt(i);
				}
			}
		}
		return tampung;
	}
	
	public String camelCaseToUnderscored(String data){
		if (data.contains(" ")) {
			throw new StringConversionUtilException("String tidak boleh mengandung spasi");
		}else if(data.contains("_")) {
			throw new StringConversionUtilException("String tidak boleh mengandung underscore");
		}
		
		String tampung = "";
		for (int i = 0; i < data.length(); i++) {
			if (Character.isUpperCase(data.charAt(i))) {
				tampung +=  "_" + Character.toLowerCase(data.charAt(i));
			}else {
				tampung += data.charAt(i);
			}
		}
		return tampung;
	}
}
