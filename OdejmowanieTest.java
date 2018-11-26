package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OdejmowanieTest {

	@Test
	void testOdejmowanie() {
		Junit test = new Junit();
		int result = test.odejmowanie(5, 2);
		assertEquals(3, result);
	}
	
}
