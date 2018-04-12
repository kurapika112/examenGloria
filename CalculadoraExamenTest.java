package m5.uf3.gloria;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CalculadoraExamenTest {

	@Test
	void testPotencia() {
		Calculadora calc = new Calculadora(3, 2);
		assertEquals(calc.residu(), 9);
	}
	
	@Test
	void testResidu1() {
		Calculadora calc = new Calculadora(3, 2);
		assertFalse(calc.residu());
	}
	
	@Test
	void testResidu2() {
		Calculadora calc = new Calculadora(2, 2);
		assertTrue(calc.residu());
	}
	
	

}
