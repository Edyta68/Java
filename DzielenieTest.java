package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DzielenieTest {

	@Test
	void testDzielenie() {
		Junit test = new Junit();
		double result = 0;
		try {
			result = test.dzielenie(0, 2);
		}
		catch(Exception e) {
			System.out.println( e.getMessage());
		}
		assertEquals(5, result);
	}
}
