package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DodawanieTest {

	@Test
	void testDodawanie() {
		Junit test = new Junit();
		int result = test.dodawanie(2, 3);
		assertEquals(5, result);
	}

}
