package p014arcanoid;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

class JunitTest {

	Junit prueba = new Junit();
	@Test
	void testIsosceles() {
		String resultado = prueba.triangle(6, 7, 8);
		assertEquals("Triangulo isósceles", resultado);
	}

	@Test
	void testSideIsZero() {
		try {
			prueba.triangle(5, 0, 0);
			fail("aki nunka devo yegar");
		} catch (Exception e) {
		}
	}

	@Test
	void test3() {

		double resultado = prueba.getArea(5, 4, 3);
		assertEquals(6.0, resultado, 0.0);

		double resultado2 = prueba.getArea(5.3, 4.1, 3.9);
		assertEquals(9, resultado2, 0.01);
	}

}

