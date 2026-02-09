package p014arcanoid;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class ColaTest {

	Cola<String> colaString;

	@Test
	void test() {
		colaString = new Cola<>();
		assertEquals(0, colaString.numElementos());
		colaString.encolar("hola");
		assertEquals(1, colaString.numElementos());
		String desencolar;
		try {
			desencolar = colaString.desencolar();
			assertEquals("hola", desencolar);
		} catch (ColaVacia e) {
			fail("deberia tener un elemento");
		}
		colaString.encolar("hola");
		assertEquals(1, colaString.numElementos());
		colaString.encolar("mundo");
		assertEquals(2, colaString.numElementos());

		try {
			colaString.desencolar();
			assertEquals(1, colaString.numElementos());
			colaString.desencolar();
			assertEquals(0, colaString.numElementos());
		} catch (ColaVacia e) {
			fail("deberia tener elementos");
		}
		try {
			colaString.desencolar();
			fail("no deberian quedarme elementos");
		} catch (Exception e) {
		}

	}

}
