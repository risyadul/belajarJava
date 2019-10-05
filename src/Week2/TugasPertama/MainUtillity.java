package UnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MainUtillity {

	Utillity test = new Utillity();
	
	@Test
	public void remove_char_return_roy_kumo_when_roy_kumo() {
		String expected = "royKumo";
		assertEquals(expected, test.buangChar("roy_kumo"));
	}
	
}
