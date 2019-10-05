package UnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class MainCalculator {
	
	Scanner test = new Scanner(System.in);
	Calculator cal = new Calculator();
	
	public static void main(String[] args) {

	}
	
	@Test
	public void sum_return_5_when_2_plus_3() {
		int expected = 5;
		assertEquals(expected, cal.sum(2, 3), "ooke");
		
		
	}
}
