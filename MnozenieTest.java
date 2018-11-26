package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class MnozenieTest {

	@Test
	void Mnozenietest() {
		Junit test = new Junit();
		int result = test.mnozenie(40, 2);
		assertEquals(20, result);
	}

}
