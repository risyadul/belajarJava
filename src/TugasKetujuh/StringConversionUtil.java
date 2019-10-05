package TugasKetujuh;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class StringConversionUtil {
	
	StringConversionUtilTest util = new StringConversionUtilTest();
	
	/*
	 * 
	 * buat implementasi method2 yang terdapat test case nya dibawah ini
	 * 
	 * 1. underscoredToCamelCase
	 * 		-convert string yang dipisahkan oleh underscore menjadi camelCase
	 * 		-string tidak boleh ada spasi
	 * 		-jika ada underscore yang bersebelahan, maka dianggap menjadi 1
	 * 
	 * 2. camelCaseToUnderscored
	 * 		-convert string yang berbentuk camelCase menjadi dipisahkan oleh underscore
	 * 		-string tidak boleh ada spasi dan underscore
	 * 		-jika ada lebih dari 1 huruf capital yang bersebelahan
	 * 			maka kumpulan sebelum huruf capital terakhir dianggap menjadi 1 bagian, 
	 * 			sedangkan huruf capital terakhir diperlakukan seperti camelCase biasa
	 * 		-angka diperlakukan seperti camelCase
	 * 		-tidak boleh menggunakan regex
	 */
	
	@Test
	public void testUnderscoredToCamelCase() {
		String underscored = "last_opened_date";
		String camelCased = "lastOpenedDate";
		assertEquals(camelCased, util.underscoredToCamelCase(underscored));
	}

	@Test
	public void testUnderscoredToCamelCaseConsecutiveUnderscore() {
		String underscored = "last_opened_date";
		String camelCased = "lastOpenedDate";
		assertEquals(camelCased, util.underscoredToCamelCase(underscored));
	}
	
	@Test
	public void testCamelCaseToUnderscored() throws Exception {
		String underscored = "last_opened_date";
		String camelCased = "lastOpenedDate";
		assertEquals(underscored, util.camelCaseToUnderscored(camelCased));
	}

//	@Test
//	public void testCamelCaseToUnderscoredWithConsecutiveUpper() {
//		String underscored = "last_opened_date_acc_jenius";
//		String camelCased = "lastOpenedDateACCJenius";
//		assertEquals(underscored, util.camelCaseToUnderscored(camelCased));
//	}

//	@Test
//	public void testCamelCaseToUnderscoredWithConsecutiveUpperAndNumber() {
//		String underscored = "acc_jenius_1_acc_tahapan_123";
//		String camelCased = "ACCJenius1ACCTahapan123";
//		assertEquals(underscored, util.camelCaseToUnderscored(camelCased));
//	}
//
	@Test
	public void testCamelCaseToUnderscoredContainSpaceBetween() {
		String underscored = "last_opened_date";
		String camelCased = "last Opened Date";
		
		StringConversionUtilException ex = assertThrows(StringConversionUtilException.class, 
					()->{
		                util.camelCaseToUnderscored(camelCased);
					}
		);
		assertEquals("String tidak boleh mengandung spasi", ex.getMessage());
	}
//
	@Test
	public void testCamelCaseToUnderscoredContainSpaceBeforeAfter()  {
		String underscored = "last_opened_date";
		String camelCased = " lastOpenedDate ";
		
		StringConversionUtilException ex = assertThrows(StringConversionUtilException.class, 
					()->{
						util.camelCaseToUnderscored(camelCased);
					}
		);
		assertEquals("String tidak boleh mengandung spasi", ex.getMessage());
	}
//
	@Test
	public void testCamelCaseToUnderscoredContainUnderscore() {
		String underscored = "last_opened_date";
		String camelCased = "last_Opened_Date";
		
		StringConversionUtilException ex = assertThrows(StringConversionUtilException.class, 
					()->{
		                util.camelCaseToUnderscored(camelCased);
					}
		);
		assertEquals("String tidak boleh mengandung underscore", ex.getMessage());
	}

}
